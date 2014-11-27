package com.haedrig.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.haedrig.model.User;
import com.haedrig.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	private final String LIST_ACTION = "redirect:/user";

	// show one
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getUser(@PathVariable int id,
			HttpServletRequest request, HttpServletResponse response) {
		User user = userService.findById(id);
		ModelAndView mav = new ModelAndView("user");
		mav.addObject(user);
		return mav;
	}

	/** 　列表　 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) {
		List<User> userlist = userService.findAll();
		return new ModelAndView("/user/list", "userlist", userlist);
	}

	/** 　删除　 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ModelAndView delete(@PathVariable Integer id,
			HttpServletRequest request, HttpServletResponse response) {
		userService.delete(id);
		return new ModelAndView(LIST_ACTION);
	}
}
