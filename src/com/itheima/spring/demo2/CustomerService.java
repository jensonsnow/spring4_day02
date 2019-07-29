package com.itheima.spring.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customerService")
@Scope("prototype")
public class CustomerService {
	
	
	@PostConstruct
	public void init() {
		System.out.println("CustomerService被初始化了");
	}
	
	
	public void save() {
		System.out.println("CustomerService被保存了");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("CustomerService被销毁了");
	}

}
