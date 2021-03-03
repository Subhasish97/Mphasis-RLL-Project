package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.User;

public interface UserService {
	
	public Boolean insert(User user);
	public List<User> getAllUsers();
	public List<User> getUserById( String id);
	public List<User> update(User user);
	public List<User> delete(String id);

}
