package com.hjr.framework.appollo.spider.worker;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/21 3:12 AM
 */
public class WordMerageResultToCSV {
    private static Logger logger = LoggerFactory.getLogger(WordMerageResultToCSV.class);
    public static String PATH_SEPERATOR = "/";
    public static void main(String[] args) {
        try {
            List<String> lines = FileUtils.readLines(new File("/Users/zhangdequan/Downloads/dev-project/nodejs/resultMerge.json"));
            List<WordPageProcessor.Word> wordList = new ArrayList<>();
            lines.forEach(line -> {
                wordList.add(JSON.parseObject(line, WordPageProcessor.Word.class));
            });
            JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(wordList));
            String csv = Tools.JsonToCsv(jsonArray,
                    "word",
                    "strokeNum",
                    "oldWord",
                    "oldWordStrokeNum",
                    "bushou",
                    "pinyin",
                    "url",
                    "desc");

            String path = "/Users/zhangdequan/Downloads/dev-project/nodejs/";
            try {
                PrintWriter printWriter = new PrintWriter(new FileWriter(getFile(path + "resultMerge.csv"), true));
                printWriter.println(csv);
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
