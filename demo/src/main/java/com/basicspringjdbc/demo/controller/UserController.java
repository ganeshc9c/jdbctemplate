package com.basicspringjdbc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.basicspringjdbc.demo.dao.UserRepository;
import com.basicspringjdbc.demo.entity.User;

@RestController
public class UserController {
	@Autowired
	UserRepository userrepository;

	@PostMapping("/user")
	User addUser(@RequestBody User user) {
		return userrepository.saveUser(user);
	}
}
