package com.cinemaGhar.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.AdminDao;
import com.cinemaGhar.dao.entity.Admin;

//*****************************************************************************
//****************ADMIN DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
@Repository
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory sessionFactory;

	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session) sessionFactory.getCurrentSession();
	}

	//METHOD FOR CREATING AND INSERTING TO ADMIN TABLE
	//------------------------------------------------
	@Override
	public boolean insert(Admin admin) {

		getSession().saveOrUpdate(admin);
		System.out.println("admin " + admin.getName() + " stored in the DB !!!");
		return true;
	}

	//METHOD FOR RETRIVING A ADMIN ROW BY ADMIN ID FROM ADMIN TABLE
	//-------------------------------------------------------------
	@Override
	public List<Admin> getAdminById(Long adminId) {
		Query query = getSession().createQuery("From Admin where id =:id");
		query.setParameter("id", adminId);

		List<Admin> adminList = query.list();
		if (adminList.isEmpty()) {
			System.out.println("Admin not Found!!");
		}
		return adminList;
	}

	//METHOD FOR RETRIVING A ADMIN ROW BY ADMIN EMAIL FROM ADMIN TABLE
	//----------------------------------------------------------------
	@Override
	public List<Admin> getAdminByEmail(String emailId) {
		System.out.println(emailId);
		Query query = getSession().createQuery("From Admin where email=:email");
		query.setParameter("email", emailId);

		List<Admin> adminList = query.list();
		System.out.println(adminList);

		if(adminList.isEmpty())
		{ 
			System.out.println("Admin not Found by EMAIL!!");
		}

		return adminList;
	}
	
	//METHOD FOR RETRIVING A ADMIN EMAIL BY EMAIL ID FROM ADMIN TABLE
	//------------------------------------------------------------------
	@Override
	public String getAdminEmail(String email) {

		Query query = getSession().createQuery("Select ad.email From Admin ad where email=:email");
		query.setParameter("email", email);
		String emailId=(String) query.uniqueResult();
		return emailId;

	}

	//METHOD FOR RETRIVING A ADMIN PASSWORD BY ADMIN EMAIL ID FROM ADMIN TABLE
	//------------------------------------------------------------------------
	@Override
	public String getAdminPassword(String email)
	{
		Query query = getSession().createQuery("Select ad.pwd From Admin ad where email=:email");
		query.setParameter("email", email);
		String password=(String) query.uniqueResult();
		return password;


	}

}
