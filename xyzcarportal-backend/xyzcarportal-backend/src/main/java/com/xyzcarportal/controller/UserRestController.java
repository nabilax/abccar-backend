package com.xyzcarportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyzcarportal.entity.User;
import com.xyzcarportal.service.UserImp;

@RestController
public class UserRestController {
	@Autowired
	UserImp utservice;
	@GetMapping("/testrest")
	public String testmethod()
	{
		return "hello";
	}
	
	@PostMapping(value = "/adduser")
	public String addProduct(@RequestBody User cust)
	{
		System.out.println(cust.getUserName());
		utservice.AddUser(cust);
		return "data added";
	}

}
