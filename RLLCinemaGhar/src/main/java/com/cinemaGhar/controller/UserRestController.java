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

//**********************************************************
//***********USER REST CONTROLLER CLASS*********************
//**********************************************************
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserRestController 
{
	@Autowired
	UserService userService;
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO USER TABLE
	//*************************************************************
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user)
	{
		userService.insert(user);
		return user;
		
	}
	
	//REST-CONTROLLER METHOD FOR RETRIVING ALL THE VALUES FROM USER TABLE
	//*******************************************************************
	@GetMapping("/getAllUser")
	public List<User> getAllUser()
	{
		
		return userService.getAllUsers();
		
	}
	
	//REST-CONTROLLER METHOD FOR SEARCHING THE USER BY USERID
	//*******************************************************
	
	@GetMapping("/userById/{userid}")
	public List<User> searchUser(@PathVariable("userid") Long id)
	{
		return userService.getUserById(id);
	}
	
	//REST-CONTROLLER METHOD FOR VALIDATE THE USER BY EMAIL AND PASSWORD
	//******************************************************************
	
	@GetMapping("/userValidate/'{email}'/{pass}")
	public String userValidate(@PathVariable("email") String email,
								@PathVariable("pass") String pwd)
	{
		String userName=userService.getUserEmail(email);
		String password=userService.getUserPassword(email);
		if(userName!=null)
		{
			if(userName.equals(email) && password.equals(pwd))
			{
				System.out.println("Welcome "+userName);
				System.out.println("Login Successful");
				return "Welcome"+userName;
			}
			else
			{
				return "Login UnSuccessful Try Again";
			}
		}
		else
		{
			return "Invalid USER";
		}

	}
	
}
