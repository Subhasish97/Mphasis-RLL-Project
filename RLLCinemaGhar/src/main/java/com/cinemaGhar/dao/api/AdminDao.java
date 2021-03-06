package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.Admin;

public interface AdminDao
{
	public boolean insert(Admin admin);
	public List<Admin> getAdminById(Long adminId);
	public List<Admin> getAdminByEmail(String email);
	public String getAdminEmail(String email);
	public String getAdminPassword(String email);

	
}
