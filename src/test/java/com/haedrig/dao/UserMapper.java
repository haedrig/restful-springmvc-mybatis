package com.haedrig.dao;

import java.util.List;

import com.haedrig.model.User;

public interface UserMapper {
	
	int insert(User user);

	int delete(Integer id);

    int edit(User user);
    
    User findById(Integer id);

    List<User> findAll();
    
}
