package com.allinpay.sample.spring.component;

import org.springframework.stereotype.Component;

@Component
public class TestComponentImpl implements ITestComponent {

	public String hello(String name) {
		return "Hello, " + name;
	}

}
