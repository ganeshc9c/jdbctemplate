package com.basicspringjdbc.demo.dao;

import com.basicspringjdbc.demo.entity.User;

public interface UserRepository {
	User saveUser(User user);
	User updateUser(User user);
}
