package com.hjr.framework.appollo.spider.worker;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/20 5:55 PM
 */
public class WordPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    @Override
    public void process(Page page) {
        page.getHtml().$("td.td1o1 tr").nodes().forEach(selectable -> {
            List<Selectable> tdNodes = selectable.$("td").nodes();
            if (tdNodes.size() == 2) {
                String title = tdNodes.get(0).xpath("/allText()").toString().trim();
                page.putField("url", page.getUrl().toString());
                if ("旧体字：".equalsIgnoreCase(title)) {
                    page.putField("oldWord", tdNodes.get(1).xpath("/allText()").toString().trim());
                } else
                if ("笔画数：".equalsIgnoreCase(title)) {
                    page.putField("strokeNum", tdNodes.get(1).xpath("/tidyText()").toString().trim());
                } else
                if ("拼　音：".equalsIgnoreCase(title)) {
                    page.putField("pinyin", tdNodes.get(1).xpath("/tidyText()").toString().trim());
                } else
                if ("解　释：".equalsIgnoreCase(title)) {
                    page.putField("desc", tdNodes.get(1).xpath("/tidyText()").toString().trim());
                } else
                if ("部　首：".equalsIgnoreCase(title)) {
                    page.putField("bushou", tdNodes.get(1).xpath("/tidyText()").toString().trim());
                } else {
                    page.putField("word", title);
                }
            }
        });
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider spider = Spider.create(new WordPageProcessor())
                .addPipeline(new FilePipeline("/Users/zhangdequan/Downloads/dev-project/nodejs/result"))
                .addPipeline(new ConsolePipeline())
                .setDownloader(new WordHttpClientDownloader())
                .addUrl("http://www.cnpoem.net/hz/detail.asp?id=1");
        String urlPrefix = "http://www.cnpoem.net/hz/detail.asp?id=";
        int wordNum = 16162;
//        int wordNum = 0;
        for (int i = 1; i <= wordNum; i++) {
            spider.addUrl(urlPrefix + i);
        }
        spider.thread(20).run();
    }

    public static class Word {
        private String url;
        private String word;
        private String strokeNum;
        private String oldWord;
        private String oldWordStrokeNum;
        private String bushou;
        private String pinyin;
        private String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getStrokeNum() {
            return strokeNum;
        }

        public void setStrokeNum(String strokeNum) {
            this.strokeNum = strokeNum;
        }

        public String getOldWord() {
            return oldWord;
        }

        public void setOldWord(String oldWord) {
            this.oldWord = oldWord;
        }

        public String getOldWordStrokeNum() {
            return oldWordStrokeNum;
        }

        public void setOldWordStrokeNum(String oldWordStrokeNum) {
            this.oldWordStrokeNum = oldWordStrokeNum;
        }

        public String getBushou() {
            return bushou;
        }

        public void setBushou(String bushou) {
            this.bushou = bushou;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }
    }
}