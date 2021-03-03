package com.cinemaGhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinemaGhar.dao.entity.User;
import com.cinemaGhar.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserRestController 
{
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	public User createAdmin(@RequestBody User user)
	{
		userService.insert(user);
		return user;
		
	}
	@GetMapping("/userById/{userid}")
	public List<User> searchUser(@PathVariable("userid") String id)
	{
		return userService.getUserById(id);
		
	}

}
