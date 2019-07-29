package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.spring.demo1.UserService;

public class SpringDemo2 {
	
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService);
		
		CustomerService customerService2 = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService2);
		
		
		applicationContext.close();
	}

}
