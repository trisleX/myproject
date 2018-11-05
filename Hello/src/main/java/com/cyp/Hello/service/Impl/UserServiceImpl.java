package com.cyp.Hello.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cyp.Hello.dao.IUserDao;
import com.cyp.Hello.entity.User;
import com.cyp.Hello.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectUserById(userId);
	}
	
}
