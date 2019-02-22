package com.hjr.framework.appollo.spider.domain.crawltaskmanager;

import com.hjr.framework.appollo.spider.domain.CrawlTask;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/13 下午4:16
 */
public class CrawlTaskVo extends CrawlTask {
    private String scheduleTypeStr;
    private String ynStr;

    public static CrawlTaskVo transFrom(CrawlTask bean) {
        CrawlTaskVo beanVo = new CrawlTaskVo();
        beanVo.setId(bean.getId());
        beanVo.setName(bean.getName());
        beanVo.setScheduleType(bean.getScheduleType());
        beanVo.setScheduleCron(bean.getScheduleCron());
        beanVo.setLastExecuteTime(bean.getLastExecuteTime());
        beanVo.setNextExecuteTime(bean.getNextExecuteTime());
        beanVo.setYn(bean.getYn());
        beanVo.setCreateTime(bean.getCreateTime());
        beanVo.setModifyTime(bean.getModifyTime());

        // 扩展字段
        Byte yn = bean.getYn();
        beanVo.setYnStr(yn == null ? "" : (yn == 1 ? "有效" : "无效"));
        Byte scheduleType = bean.getScheduleType();
        beanVo.setScheduleTypeStr((scheduleType == null ? "" : (scheduleType == 1 ? "临时任务" : "周期任务")));
        return beanVo;
    }

    public static List<CrawlTaskVo> transFrom(List<? extends CrawlTask> beans) {
        List<CrawlTaskVo> beanVos = new ArrayList<>();
        for (CrawlTask crawlTask : beans) {
            beanVos.add(transFrom(crawlTask));
        }
        return beanVos;
    }

    public String getScheduleTypeStr() {
        return scheduleTypeStr;
    }

    public void setScheduleTypeStr(String scheduleTypeStr) {
        this.scheduleTypeStr = scheduleTypeStr;
    }

    public String getYnStr() {
        return ynStr;
    }

    public void setYnStr(String ynStr) {
        this.ynStr = ynStr;
    }
}
