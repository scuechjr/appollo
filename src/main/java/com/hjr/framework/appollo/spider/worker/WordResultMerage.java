package com.hjr.framework.appollo.spider.worker;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;
import org.jooq.tools.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/21 3:12 AM
 */
public class WordResultMerage {
    private static Logger logger = LoggerFactory.getLogger(WordResultMerage.class);
    public static String PATH_SEPERATOR = "/";
    public static void main(String[] args) {
        try {
            List<String> lines1 = FileUtils.readLines(new File("/Users/zhangdequan/Downloads/dev-project/nodejs/result/www.cnpoem.net/result.json"));
            List<String> lines2 = FileUtils.readLines(new File("/Users/zhangdequan/Downloads/dev-project/nodejs/resultStroke/bihua.911cha.com/result.json"));
            Map<String, WordPageProcessor.Word> map = new HashMap<>();
            lines1.forEach(line -> {
                WordPageProcessor.Word word = JSON.parseObject(line, WordPageProcessor.Word.class);
                if (!StringUtils.isBlank(word.getOldWord())) {
                    map.put(word.getOldWord(), word);
                } else {
                    map.put(word.getWord(), word);
                }
            });
            lines2.forEach(line -> {
                WordPageProcessor.Word word = JSON.parseObject(line, WordPageProcessor.Word.class);
                if (map.get(word.getWord()) != null) {
                    map.get(word.getWord()).setOldWordStrokeNum(word.getStrokeNum());
                }
            });

            String path = "/Users/zhangdequan/Downloads/dev-project/nodejs/";
            try {
                PrintWriter printWriter = new PrintWriter(new FileWriter(getFile(path + "resultMerge.json"), true));
                for (String key : map.keySet()) {
                    printWriter.println(JSON.toJSONString(map.get(key)));
                }
                printWriter.close();
            } catch (IOException e) {
                logger.warn("write file error", e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getFile(String fullName) {
        checkAndMakeParentDirecotry(fullName);
        return new File(fullName);
    }

    public static void checkAndMakeParentDirecotry(String fullName) {
        int index = fullName.lastIndexOf(PATH_SEPERATOR);
        if (index > 0) {
            String path = fullName.substring(0, index);
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }
}
