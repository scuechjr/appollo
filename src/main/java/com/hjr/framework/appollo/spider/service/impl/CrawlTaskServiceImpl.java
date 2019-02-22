package com.hjr.framework.appollo.spider.service.impl;

import com.hjr.framework.appollo.base.PaginationResult;
import com.hjr.framework.appollo.spider.domain.CrawlTask;
import com.hjr.framework.appollo.spider.domain.CrawlTaskExample;
import com.hjr.framework.appollo.spider.domain.crawltaskmanager.CrawlTaskQuery;
import com.hjr.framework.appollo.spider.domain.crawltaskmanager.CrawlTaskVo;
import com.hjr.framework.appollo.spider.mybatis.mapper.CrawlTaskMapper;
import com.hjr.framework.appollo.spider.service.CrawlTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/13 下午1:59
 */
@Service("crawlTaskService")
public class CrawlTaskServiceImpl implements CrawlTaskService {
    @Resource
    private CrawlTaskMapper crawlTaskMapper;

    @Override
    public PaginationResult<CrawlTaskVo> paginationQuery(CrawlTaskQuery params) {
        CrawlTaskExample example = new CrawlTaskExample();
        long totalCount = crawlTaskMapper.countByExample(example);
        if (totalCount < 1) {
            return PaginationResult.create()
                    .setPageNo(params.getPageNo())
                    .setPageSiZe(params.getPageSize())
                    .setTotalCount(totalCount);
        }

        return PaginationResult.create()
                .setPageNo(params.getPageNo())
                .setPageSiZe(params.getPageSize())
                .setTotalCount(totalCount)
                .setData(CrawlTaskVo.transFrom(crawlTaskMapper.selectByExample(example)));
    }

    @Override
    public List<CrawlTaskVo> query(CrawlTaskQuery params) {
        CrawlTaskExample example = new CrawlTaskExample();
        return CrawlTaskVo.transFrom(crawlTaskMapper.selectByExample(example));
    }

    @Override
    public int save(CrawlTask params) {
        Date now = new Date();
        params.setYn((byte)1);
        params.setModifyTime(now);
        if (params.getId() != null) {
            return crawlTaskMapper.updateByPrimaryKeySelective(params);
        }
        params.setCreateTime(now);
        return crawlTaskMapper.insertSelective(params);
    }

    @Override
    public int delById(Long id) {
        CrawlTask params = new CrawlTask();
        params.setYn((byte)0);
        params.setModifyTime(new Date());
        return crawlTaskMapper.updateByPrimaryKeySelective(params);
    }
}
