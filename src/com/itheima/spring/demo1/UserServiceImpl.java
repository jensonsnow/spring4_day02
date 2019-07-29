package com.itheima.spring.demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	/*
	 * @Autowired
	 * 
	 * @Qualifier
	 */
	
	@Resource(name="userDao")
	public UserDao userDao;
	
	
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl÷¥––¡À");
		userDao.save();
	}

}
