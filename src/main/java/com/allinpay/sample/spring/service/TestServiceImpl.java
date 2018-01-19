package com.allinpay.sample.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinpay.sample.spring.component.ITestComponent;

@Service
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestComponent testComponentImpl;

	public String hello(String name) {
		return testComponentImpl.hello(name);
	}

	public void setTestComponentImpl(ITestComponent testComponentImpl) {
		this.testComponentImpl = testComponentImpl;
	}

	public ITestComponent getTestComponentImpl() {
		return testComponentImpl;
	}

}
