package com.basicspringjdbc.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.basicspringjdbc.demo.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	private static final String INSER_USER_QUERY = "INSERT INTO user(id,fname,lname,email) values(?,?,?,?)";
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public User saveUser(User user) {
		jdbcTemplate.update(INSER_USER_QUERY, user.getId(), user.getFname(), user.getLname(), user.getEmail());
		return user;
	}

	@Override
	public User updateUser(User user) {

		return null;
	}

}
