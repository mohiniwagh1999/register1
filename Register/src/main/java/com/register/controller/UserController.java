package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/registerUser")
	public String registerUser()
	{
		return "home";
	}

}
