package com.jt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jt.dao.UserMapper;
import com.jt.pojo.User;
import com.jt.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public List<User> selectAll() {
		return userMapper.selectList(null);
	}


	@Transactional
	@Override
	public void saveUser(User user) {
		userMapper.insert(user);
	}


}
