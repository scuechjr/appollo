package com.hjr.framework.appollo.spider.domain.crawltaskmanager;

import com.hjr.framework.appollo.spider.domain.CrawlTask;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/13 下午4:14
 */
public class CrawlTaskQuery extends CrawlTask {
    private Long pageNo;
    private Long pageSize;

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
}
