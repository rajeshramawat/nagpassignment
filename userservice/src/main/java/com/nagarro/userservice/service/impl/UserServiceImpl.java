package com.nagarro.userservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.userservice.entity.User;
import com.nagarro.userservice.repository.UserRepository;
import com.nagarro.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(Long id) throws Exception {
		
		Optional<User> userOptional = userRepository.findById(id);
		if(userOptional.isPresent()) {
			return userOptional.get();
		}
		
		throw new Exception("There is no user for user id");
	}

}
