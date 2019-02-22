package com.hjr.framework.appollo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/6 下午6:38
 */
@SpringBootApplication
@MapperScan("com.hjr.framework.appollo.spider.mybatis.mapper")
@ComponentScan({"com.hjr.framework.appollo"})
@EnableScheduling
@EnableAutoConfiguration
public class AppolloApplication {
    public AppolloApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(AppolloApplication.class, args);
    }
}
