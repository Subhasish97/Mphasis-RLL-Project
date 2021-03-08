package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.AdminDao;
import com.cinemaGhar.dao.entity.Admin;

//*************************************************************************
//********************ADMIN SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao adminDao;

	@Override
	public Boolean insert(Admin admin) {
		return adminDao.insert(admin);
	}

	@Override
	public List<Admin> getAdminById(Long id) {
		return adminDao.getAdminById(id);
	}

	@Override
	public List<Admin> getAdminByEmail(String email) {
		return adminDao.getAdminByEmail(email);
	}

	@Override
	public String getAdminEmail(String email) {
		return adminDao.getAdminEmail(email);
	}

	@Override
	public String getAdminPassword(String email) {
		return adminDao.getAdminPassword(email);
	}

}
