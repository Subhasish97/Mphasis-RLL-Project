package com.cinemaGhar.controller;

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




@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminRestController
{
	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/createAdmin")
	public Admin createAdmin(@RequestBody Admin admin)
	{
		adminService.insert(admin);
		return admin;
		
	}
	@GetMapping("/adminById/{adminid}")
	public List<Admin> searchAdmin(@PathVariable("adminid") String id)
	{
		return adminService.getAdminById(id);
		
	}
	@GetMapping("/adminByEmail/{email}")
	public List<Admin> searchAdminByEmail(@PathVariable("email") String email)
	{
		return adminService.getAdminByEmail(email);
		
	}
	@GetMapping("/admin/getAllUser")
	public List<User> getAllUser()
	{
		
		return userService.getAllUsers();
		
	}
	
	@DeleteMapping("/delete/{userid}")
	public List<User> deleteUser(@PathVariable("userid") String id)
	{
		return userService.delete(id);
		
	}

}
