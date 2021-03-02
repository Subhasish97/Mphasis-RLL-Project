package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.User;

public interface UserDao 
{
	public boolean insert(User user);
	public List<User> getAllUser();
	public List<User> delete(String userId);
	public List<User> update(User user);
	public List<User> getUserById(String userId);
	
}
