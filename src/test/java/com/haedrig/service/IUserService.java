package com.haedrig.service;

import java.util.List;

import com.haedrig.model.User;

public interface IUserService {

	int insert(User user);

	int delete(Integer id);

    int edit(User user);
    
    User findById(Integer id);

    List<User> findAll();
    
}
