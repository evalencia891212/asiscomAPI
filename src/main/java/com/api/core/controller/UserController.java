package com.api.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.api.core.entity.User;
import com.api.core.model.MUser;
import com.api.core.service.UserService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	@PutMapping("/user")
	public boolean createUser(@RequestBody @Valid User user)
	{
		return userService.create(user);
	}
	
	@GetMapping("/user/{userName}")
	public List<MUser> getByName(@PathVariable String userName)
	{
		return userService.findByName(userName);
	}

}
