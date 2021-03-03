package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.AdminDao;
import com.cinemaGhar.dao.entity.Admin;

@Repository
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao 
{
	@Autowired
	SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}	

	@Override
	public boolean insert(Admin admin) 
	{
		
		getSession().saveOrUpdate(admin);
		System.out.println("admin " + admin.getName()+" stored in the DB !!!");
		return true;
	}

	@Override
	public List<Admin> getAdminById(String adminId) 
	{
		Query query = getSession().createQuery("From Admin where id =:id");
		query.setParameter("id", adminId);
		
		List<Admin> adminList=query.list();
		if(adminList.isEmpty()) {
			System.out.println("Admin not Found!!");
		}
		return adminList;
	}

	@Override
	public List<Admin> getAdminByEmail(String emailId) 
	{
		Query query = getSession().createQuery("From Admin where email =:email");
		query.setParameter("email", emailId);
		
		List<Admin> adminList=query.list();
		if(adminList.isEmpty()) {
			System.out.println("Admin not Found by EMAIL!!");
		}
		return adminList;
	}

}
