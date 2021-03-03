package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.Admin;

public interface AdminDao
{
	public boolean insert(Admin admin);
	public List<Admin> getAdminById(String adminId);
	public List<Admin> getAdminByEmail(String email);

	
}
