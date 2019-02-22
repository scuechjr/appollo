package com.hjr.framework.appollo.spider.dao;

import com.hjr.framework.appollo.spider.domain.PictureRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("picDao")
public class PictureDao {
    private final DSLContext create;
    @Autowired
    public PictureDao(DSLContext dslContext) {
        this.create = dslContext;
    }
}
