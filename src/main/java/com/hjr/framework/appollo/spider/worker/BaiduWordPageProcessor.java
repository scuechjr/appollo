package com.hjr.framework.appollo.spider.worker;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/20 5:55 PM
 */
public class BaiduWordPageProcessor implements PageProcessor {
    private static final String URL_PREFIX = "http://hanyu.baidu.com/zici/s?wd=";
    public static final String DATA_KEY = "BAIDU_WORD";
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    @Override
    public void process(Page page) {
        BaiduWord baiduWord = new BaiduWord();
        Object extra = page.getRequest().getExtra(DATA_KEY);
        if (extra instanceof BaiduWord) {
            baiduWord = (BaiduWord) extra;
            // 添加繁体字信息
            baiduWord.setTraditionalImgSrc(page.getHtml().xpath("//*[@id='word_bishun']/@data-gif").toString());
            baiduWord.setTraditionalRadical(page.getHtml().xpath("//*[@id='radical']/span/text()").toString());
            baiduWord.setTraditionalStrokeCount(page.getHtml().xpath("//*[@id='stroke_count']/span/text()").toString());
            baiduWord.setTraditionalWuxing(page.getHtml().xpath("//*[@id='wuxing']/span/text()").toString());
            baiduWord.setTraditionalWubi(page.getHtml().xpath("//*[@id='wubi']/span/text()").toString());
            page.putField(DATA_KEY, baiduWord);
        } else {
            // 获取简体字信息
            baiduWord.setWord(page.getHtml().xpath("//*[@id='pc-word-body']/@data-name").toString());
            baiduWord.setImgSrc(page.getHtml().xpath("//*[@id='word_bishun']/@data-gif").toString());
            baiduWord.setPinyin(page.getHtml().xpath("//*[@id='pinyin']/span/b/text()").toString());
            baiduWord.setRadical(page.getHtml().xpath("//*[@id='radical']/span/text()").toString());
            baiduWord.setStrokeCount(page.getHtml().xpath("//*[@id='stroke_count']/span/text()").toString());
            baiduWord.setWuxing(page.getHtml().xpath("//*[@id='wuxing']/span/text()").toString());
            baiduWord.setWubi(page.getHtml().xpath("//*[@id='wubi']/span/text()").toString());
            String traditional = page.getHtml().xpath("//*[@id='traditional']/span/text()").toString();

            // 如果有繁体字，查询繁体字信息
            page.putField("traditional", traditional);
            if (StringUtils.isNotBlank(traditional)) {
                baiduWord.setTraditional(traditional);
                Request request = new Request();
                request.setUrl(URL_PREFIX + traditional);
                request.putExtra(DATA_KEY, baiduWord);
                page.addTargetRequest(request);
            } else {
                page.putField(DATA_KEY, baiduWord);
            }
        }
    }

    @Override
    public Site getSite() {
        site.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.109 Safari/537.36");
        return site;
    }

    public static void main(String[] args) {
        Spider spider = Spider.create(new BaiduWordPageProcessor())
                .addPipeline(new BaiduWordFilePipeline("/Users/zhangdequan/Downloads/dev-project/nodejs/baiduresult"))
                .addPipeline(new ConsolePipeline())
                .addUrl("http://hanyu.baidu.com/zici/s?wd=柠");

        try {
            List<String> lines = FileUtils.readLines(new File("/Users/zhangdequan/Downloads/dev-project/nodejs/result/www.cnpoem.net/result.json"));
            lines.forEach(line -> {
                WordPageProcessor.Word word = JSON.parseObject(line, WordPageProcessor.Word.class);
                if (StringUtils.isNotBlank(word.getWord())) {
                    spider.addUrl(URL_PREFIX + word.getWord().substring(word.getWord().length() - 1));
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        spider.thread(20).run();
    }

    public static class BaiduWord {
        private String word;

        // 简体字
        private String imgSrc;
        private String radical;
        private String pinyin;
        private String strokeCount;
        private String wuxing;
        private String traditional;
        private String wubi;

        // 繁体字
        private String traditionalImgSrc;
        private String traditionalRadical;
        private String traditionalStrokeCount;
        private String traditionalWuxing;
        private String traditionalWubi;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getImgSrc() {
            return imgSrc;
        }

        public void setImgSrc(String imgSrc) {
            this.imgSrc = imgSrc;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }

        public String getRadical() {
            return radical;
        }

        public void setRadical(String radical) {
            this.radical = radical;
        }

        public String getStrokeCount() {
            return strokeCount;
        }

        public void setStrokeCount(String strokeCount) {
            this.strokeCount = strokeCount;
        }

        public String getWuxing() {
            return wuxing;
        }

        public void setWuxing(String wuxing) {
            this.wuxing = wuxing;
        }

        public String getTraditional() {
            return traditional;
        }

        public void setTraditional(String traditional) {
            this.traditional = traditional;
        }

        public String getWubi() {
            return wubi;
        }

        public void setWubi(String wubi) {
            this.wubi = wubi;
        }

        public String getTraditionalRadical() {
            return traditionalRadical;
        }

        public void setTraditionalRadical(String traditionalRadical) {
            this.traditionalRadical = traditionalRadical;
        }

        public String getTraditionalImgSrc() {
            return traditionalImgSrc;
        }

        public void setTraditionalImgSrc(String traditionalImgSrc) {
            this.traditionalImgSrc = traditionalImgSrc;
        }

        public String getTraditionalStrokeCount() {
            return traditionalStrokeCount;
        }

        public void setTraditionalStrokeCount(String traditionalStrokeCount) {
            this.traditionalStrokeCount = traditionalStrokeCount;
        }

        public String getTraditionalWuxing() {
            return traditionalWuxing;
        }

        public void setTraditionalWuxing(String traditionalWuxing) {
            this.traditionalWuxing = traditionalWuxing;
        }

        public String getTraditionalWubi() {
            return traditionalWubi;
        }

        public void setTraditionalWubi(String traditionalWubi) {
            this.traditionalWubi = traditionalWubi;
        }
    }
}