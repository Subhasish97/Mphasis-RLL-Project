package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.Admin;

public interface AdminService {
 
	public Boolean insert(Admin admin);
	public List<Admin> getAdminById(String id);
	public List<Admin> getAdminByEmail(String email);

}
