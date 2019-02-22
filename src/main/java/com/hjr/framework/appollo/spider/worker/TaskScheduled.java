package com.hjr.framework.appollo.spider.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/13 下午2:05
 */
@Component
public class TaskScheduled {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskScheduled.class);

    @Scheduled(cron="0/10 * * * * ?")
    public void executeTask() {
        Thread current = Thread.currentThread();
        LOGGER.info("定时任务1, id: {}, name: {}", current.getId(), current.getName());
    }
}
