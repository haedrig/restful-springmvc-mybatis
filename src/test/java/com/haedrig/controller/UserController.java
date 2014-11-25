package com.haedrig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haedrig.model.User;
import com.haedrig.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json", produces = {
			"application/json", "application/xml" })
	@ResponseBody
	public User getUser(@PathVariable int id) {
		return userService.findById(id);
	}
	
}
