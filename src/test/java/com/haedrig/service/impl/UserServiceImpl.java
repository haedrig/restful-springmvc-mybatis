package com.haedrig.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haedrig.dao.UserMapper;
import com.haedrig.model.User;
import com.haedrig.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	public int insert(User user) {
		return userMapper.insert(user);
	}

	public int delete(Integer id) {
		return userMapper.delete(id);
	}

	public int edit(User user) {
		return userMapper.edit(user);
	}

	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	public List<User> findAll() {
		return userMapper.findAll();
	}

}
