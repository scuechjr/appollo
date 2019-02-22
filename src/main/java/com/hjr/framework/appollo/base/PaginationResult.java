package com.hjr.framework.appollo.base;

import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/13 下午4:18
 */
public class PaginationResult<T> {
    private Long pageNo;
    private Long pageSiZe;
    private Long totalCount;
    private List<T> data;
    
    public static PaginationResult create() {
        return new PaginationResult();
    }

    public Long getPageNo() {
        return pageNo;
    }

    public PaginationResult setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Long getPageSiZe() {
        return pageSiZe;
    }

    public PaginationResult setPageSiZe(Long pageSiZe) {
        this.pageSiZe = pageSiZe;
        return this;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public PaginationResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public PaginationResult setData(List<T> data) {
        this.data = data;
        return this;
    }
}
