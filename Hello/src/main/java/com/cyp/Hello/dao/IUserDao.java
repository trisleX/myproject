package com.cyp.Hello.dao;

import org.apache.ibatis.annotations.Select;

import com.cyp.Hello.entity.User;

public interface IUserDao {
	
	@Select("select * from user where id=#{id}")
	User selectUserById(int userId);
	
}
