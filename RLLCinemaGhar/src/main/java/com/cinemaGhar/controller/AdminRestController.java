package com.cinemaGhar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinemaGhar.dao.entity.Admin;
import com.cinemaGhar.dao.entity.User;
import com.cinemaGhar.service.AdminService;
import com.cinemaGhar.service.UserService;

//**********************************************************
//***********ADMIN REST CONTROLLER CLASS*********************
//**********************************************************

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminRestController
{
	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO ADMIN TABLE
	//*************************************************************
	
	@PostMapping("/createAdmin")
	public Admin createAdmin(@RequestBody Admin admin)
	{
		adminService.insert(admin);
		return admin;
		
	}
	
	//REST-CONTROLLER METHOD FOR SEARCHING THE ADMIN BY ADMINID
	//*********************************************************
	
	@GetMapping("/adminById/{adminid}")
	public List<Admin> searchAdmin(@PathVariable("adminid") Long id)
	{
		return adminService.getAdminById(id);
		
	}
	
	//REST-CONTROLLER METHOD FOR SEARCHING THE ADMIN BY EMAILID
	//*********************************************************
	
	@GetMapping("/adminByEmail/'{email}'")
	public List<Admin> searchAdminByEmail(@PathVariable("email") String email)
	{
		return adminService.getAdminByEmail(email);
		
	}
	
	//REST-CONTROLLER METHOD FOR RETRIVING ALL USERS BY FROM USER TABLE
	//*****************************************************************
	
	@GetMapping("/admin/getAllUser")
	public List<User> getAllUser()
	{
		
		return userService.getAllUsers();
		
	}
	
	
	//REST-CONTROLLER METHOD FOR DELETE A USER BY USERID FROM USER TABLE
	//******************************************************************
	
	@DeleteMapping("/delete/{userid}")
	public List<User> deleteUser(@PathVariable("userid") Long id)
	{
		return userService.delete(id);
		
	}
	
	//REST-CONTROLLER METHOD FOR VALIDATE THE ADMIN BY EMAIL AND PASSWORD
	//*******************************************************************
	
	@GetMapping("/adminValidate/'{email}'/{pass}")
	public String adminValidate(@PathVariable("email") String email,
								@PathVariable("pass") String pwd)
	{
		String userName=adminService.getAdminEmail(email);
		String password=adminService.getAdminPassword(email);
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
			return "Invalid ADMIN";
		}

	}
	
	

}
