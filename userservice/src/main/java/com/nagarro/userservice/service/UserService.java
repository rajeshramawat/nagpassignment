package com.nagarro.userservice.service;

import com.nagarro.userservice.entity.User;

public interface UserService {

	User getUserById(Long id) throws Exception;

}
