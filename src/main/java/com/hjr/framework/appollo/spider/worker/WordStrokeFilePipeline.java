package com.hjr.framework.appollo.spider.worker;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.utils.FilePersistentBase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/20 8:47 PM
 */
public class WordStrokeFilePipeline extends FilePersistentBase implements Pipeline {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public static final String RESULT_LIST_KEY = "resultList";

    /**
     * new JsonFilePageModelPipeline with default path "/data/webmagic/"
     */
    public WordStrokeFilePipeline() {
        setPath("/data/webmagic");
    }

    public WordStrokeFilePipeline(String path) {
        setPath(path);
    }

    @Override
    public void process(ResultItems resultItems, Task task) {
        String path = this.path + PATH_SEPERATOR + task.getUUID() + PATH_SEPERATOR;
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(getFile(path + "result.json"), true));
            List<Map> resultList = resultItems.get(RESULT_LIST_KEY);
            resultList.forEach(item -> {
                printWriter.println(JSON.toJSONString(item));
            });
            printWriter.close();
        } catch (IOException e) {
            logger.warn("write file error", e);
        }
    }
}
