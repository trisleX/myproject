package com.cyp.Hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyp.Hello.entity.User;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/test")
	public String sayTest() {
		return "test";
	}

	@RequestMapping("/no")
	public Map<String, Object> say() {
		Map<String, Object> map = new HashMap<>();
		map.put("hello", "test");
		map.put("test", "judas");
		return map;
	}

	@RequestMapping("/user")
	public User printUser() {
		User user = new User(10, "a", "b");
		return user;
	}

	@GetMapping("/get/{id}")
	public String getMethod(@PathVariable int id) {
		return "输入的参数为: "+id;
	}

	@PostMapping("/post")
	public String postMethod() {
		return "post method";
	}
}
