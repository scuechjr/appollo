package com.hjr.framework.appollo.spider.service;

import com.hjr.framework.appollo.base.PaginationResult;
import com.hjr.framework.appollo.spider.domain.CrawlTask;
import com.hjr.framework.appollo.spider.domain.crawltaskmanager.CrawlTaskQuery;
import com.hjr.framework.appollo.spider.domain.crawltaskmanager.CrawlTaskVo;

import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/13 下午1:59
 */
public interface CrawlTaskService {
    /**
     * 分页查询
     * @param params
     * @return
     */
    PaginationResult<CrawlTaskVo> paginationQuery(CrawlTaskQuery params);

    /**
     * 全部查询
     * @param params
     * @return
     */
    List<CrawlTaskVo> query(CrawlTaskQuery params);

    /**
     * 保存信息
     * @param params
     * @return
     */
    int save(CrawlTask params);

    /**
     * 根据ID删除数据
     * @param id
     * @return
     */
    int delById(Long id);
}
