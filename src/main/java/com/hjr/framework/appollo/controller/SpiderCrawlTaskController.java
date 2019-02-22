package com.hjr.framework.appollo.controller;

import com.hjr.framework.appollo.base.Response;
import com.hjr.framework.appollo.spider.domain.CrawlTask;
import com.hjr.framework.appollo.spider.domain.crawltaskmanager.CrawlTaskQuery;
import com.hjr.framework.appollo.spider.service.CrawlTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 爬虫管理
 *
 * @author zhangdequan
 * @date 2018/5/6 下午9:42
 */
@Controller
@RequestMapping({"/spider/crawlTask"})
public class SpiderCrawlTaskController {
    @Resource
    private CrawlTaskService crawlTaskService;

    @RequestMapping
    public String crawlTask() {
        return "/spider/crawlTask/index";
    }

    @RequestMapping("/paginationQuery")
    @ResponseBody
    public Response paginationQuery(CrawlTaskQuery params) {
        return Response.success().setData(crawlTaskService.paginationQuery(params));
    }

    @RequestMapping("/query")
    @ResponseBody
    public Response query(CrawlTaskQuery params) {
        return Response.success().setData(crawlTaskService.query(params));
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response save(CrawlTask params) {
        if (params == null) {
            return Response.failure().setMsg("参数不合法！");
        }
        return Response.success().setData(crawlTaskService.save(params));
    }

    @RequestMapping("/delById")
    @ResponseBody
    public Response delById(CrawlTask params) {
        if (params == null || params.getId() == null) {
            return Response.failure().setMsg("请输入需要删除的任务ID！");
        }
        return Response.success().setData(crawlTaskService.delById(params.getId()));
    }
}
