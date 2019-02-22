package com.hjr.framework.appollo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hjr.framework.appollo.base.Response;
import com.hjr.framework.appollo.spider.domain.CrawlTask;
import com.hjr.framework.appollo.spider.domain.crawltaskmanager.CrawlTaskQuery;
import com.hjr.framework.appollo.spider.service.CrawlTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.component.DuplicateRemover;

import javax.annotation.Resource;

/**
 * 爬虫管理
 *
 * @author zhangdequan
 * @date 2018/5/6 下午9:42
 */
@Controller
@RequestMapping({"/spider"})
public class SpiderController {
    @Resource
    private CrawlTaskService crawlTaskService;

    @RequestMapping
    public String init() {
        return "/spider/index";
    }

    @RequestMapping("/testInsert")
    @ResponseBody
    public Response testInsert() {
        return Response.success();
    }

    @RequestMapping("/test")
    @ResponseBody
    public Response test(String url, String xpaths) {

        Response response = Response.success();
        final JSONArray obj = JSON.parseArray(xpaths);
        Spider.create(new PageProcessor() {
            private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
            @Override
            public void process(Page page) {
                page.putField("srcSite", site.toString());
                page.putField("srcUrl", page.getUrl().toString());

                for (int i = 0; i < obj.size(); i++) {
                    JSONObject o = obj.getJSONObject(i);
                    for (JSONObject.Entry<String, Object> entry : o.entrySet()) {
                        page.putField(entry.getKey(), page.getHtml().xpath(entry.getValue().toString()).all());
                    }
                }

//                for (JSONObject.Entry<String, Object> entry : obj.entrySet()) {
//                    page.putField(entry.getKey(), page.getHtml().xpath(entry.getValue().toString()).toString());
//                }
                //        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());
//        page.putField("url", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
//                page.putField("url", page.getHtml().xpath("//img/@src").all().toString());
//        page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
//        if (page.getResultItems().get("name")==null){
//            skip this page
//            page.setSkip(true);
//        }
//        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));
            }

            @Override
            public Site getSite() {
                return site;
            }
        })
                //从https://github.com/code4craft开始抓
                .addUrl(url)
                //设置Scheduler，使用Redis来管理URL队列
                .setScheduler(new QueueScheduler().setDuplicateRemover(new DuplicateRemover() {

                    @Override
                    public boolean isDuplicate(Request request, Task task) {
                        return false;
                    }

                    @Override
                    public void resetDuplicateCheck(Task task) {

                    }

                    @Override
                    public int getTotalRequestsCount(Task task) {
                        return 0;
                    }
                }))
//                .setScheduler(new FileCacheQueueScheduler("/download/export/appollo/spider/mm131"))
                //设置Pipeline，将结果以json方式保存到文件
                .addPipeline(new Pipeline() {
                    @Override
                    public void process(ResultItems resultItems, Task task) {
                        response.setData(resultItems.getAll());
                    }
                })
                //开启5个线程同时执行
                .thread(5)
                //启动爬虫
                .run();
        return response;
    }
}
