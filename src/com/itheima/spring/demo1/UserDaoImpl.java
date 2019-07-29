package com.itheima.spring.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Value("aaa")
	private String name;
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDaoImpl÷¥––¡À---------"+name);
	}

}
