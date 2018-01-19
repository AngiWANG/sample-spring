package com.allinpay.sample.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.allinpay.sample.spring.component.ITestComponent;
import com.allinpay.sample.spring.service.ITestService;
import com.allinpay.sample.spring.service.TestServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
// bean容器配置
@ContextConfiguration("classpath*:spring/*.xml")
public class AppTest {
	@Autowired
	ITestComponent testComponent;

	@Autowired
	ITestService testService;

	@Test
	public void testAbc1() {
		Assert.notNull(testComponent);
		Assert.notNull(testService);
		Assert.notNull(((TestServiceImpl) testService).getTestComponentImpl());
	}
}