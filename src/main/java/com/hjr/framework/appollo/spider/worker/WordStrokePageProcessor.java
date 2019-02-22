package com.hjr.framework.appollo.spider.worker;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;
import org.jooq.tools.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/20 5:55 PM
 */
public class WordStrokePageProcessor implements PageProcessor {
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    @Override
    public void process(Page page) {
        List<Map> resultList = new ArrayList();
        page.getHtml().$("ul.zi li").nodes().forEach(selectable -> {
            Map map = new HashMap();
            map.put("word", selectable.xpath("//a/text()").toString());
            String strokeNum = selectable.xpath("//a/span[@class=bihua]/text()").toString();
            map.put("strokeNum", strokeNum.substring(0, strokeNum.length()-2));
            resultList.add(map);
        });
        page.putField("resultList", resultList);
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider spider = Spider.create(new WordStrokePageProcessor())
                .addPipeline(new WordStrokeFilePipeline("/Users/zhangdequan/Downloads/dev-project/nodejs/resultStroke"))
                .addPipeline(new ConsolePipeline())
                .addUrl("http://bihua.911cha.com/?q=我们列出了一些路径表达式");
        String urlPrefix = "http://bihua.911cha.com/?q=";

        try {
            List<String> lines = FileUtils.readLines(new File("/Users/zhangdequan/Downloads/dev-project/nodejs/result/www.cnpoem.net/result.json"));
            StringBuilder sb = new StringBuilder();
            lines.forEach(line -> {
                WordPageProcessor.Word word = JSON.parseObject(line, WordPageProcessor.Word.class);
                sb.append(word.getOldWord());
                if (sb.length() >= 100) {
                    spider.addUrl(urlPrefix + sb.toString());
                    sb.setLength(0);
                }
            });
            if (sb.length() > 0) {
                spider.addUrl(urlPrefix + sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        spider.thread(20).run();
    }
}