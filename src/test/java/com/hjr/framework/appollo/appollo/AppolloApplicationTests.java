package com.hjr.framework.appollo.appollo;

import com.hjr.framework.appollo.spider.domain.Picture;
import com.hjr.framework.appollo.spider.mybatis.mapper.PictureMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppolloApplicationTests {
	@Resource
	private PictureMapper pictureMapper;

	@Test
	public void insert() {
		Picture record = new Picture();
		record.setSrcSite("http://www.baidu.com");
		record.setSrcUrl("http://www.baidu.com");
		pictureMapper.insert(record);
	}

}
