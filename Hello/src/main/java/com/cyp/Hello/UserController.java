package com.cyp.Hello;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyp.Hello.entity.User;
import com.cyp.Hello.service.IUserService;


@RestController
@RequestMapping("/demo")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id){
		User user  = this.userService.getUserById(id);
		return user;
	}
}
