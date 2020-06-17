package com.nagarro.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.userservice.entity.User;
import com.nagarro.userservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService UserService;
	
	@GetMapping(value = "/user/{id}")
	public User fetchUserById(@PathVariable("id") Long id) throws Exception {
		
		return UserService.getUserById(id);
	}
	
}
