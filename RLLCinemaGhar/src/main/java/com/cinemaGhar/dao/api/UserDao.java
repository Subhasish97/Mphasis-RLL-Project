package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.User;

public interface UserDao 
{
	public boolean insert(User user);
	public List<User> getAllUser();
	public List<User> delete(Long userId);
	public List<User> update(User user);
	public List<User> getUserById(Long usId);
	public String getUserEmail(String email);
	public String getUserPassword(String email);
	
	
}
