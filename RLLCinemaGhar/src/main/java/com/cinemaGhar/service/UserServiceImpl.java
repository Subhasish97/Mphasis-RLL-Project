package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.UserDao;
import com.cinemaGhar.dao.entity.User;

//*************************************************************************
//********************USER SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public Boolean insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public List<User> getAllUsers() {
	return userDao.getAllUser();
	}

	@Override
	public List<User> getUserById(Long id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> update(User user) {
		return userDao.update(user);
	}

	@Override
	public List<User> delete(Long id) {
		return userDao.delete(id);
	}

	@Override
	public String getUserEmail(String email) 
	{
		return userDao.getUserEmail(email);
	}

	@Override
	public String getUserPassword(String email) 
	{
		return userDao.getUserPassword(email);
	}

	
}
