package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.UserDao;
import com.cinemaGhar.dao.entity.User;

@Repository
@EnableTransactionManagement
public class UserDaoImpl implements UserDao
{
	@Autowired
	private SessionFactory sessionFactory;

	


	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}

	@Override
	public boolean insert(User user)
	{
		getSession().saveOrUpdate(user);
		System.out.println("admin " + user.getName()+" stored in the DB !!!");
		return true;

	}

	@Override
	public List<User> getAllUser() 
	{
		Query query = getSession().createQuery("select us from User us ");
		List<User> userList=query.list();
		return userList;
	}

	@Override
	public List<User> delete(Long userId)
	{
		Query query = getSession().createQuery("delete from User us where id=:id");
		query.setParameter("id", userId);
		query.executeUpdate();
		return getAllUser();
	}

	@Override
	public List<User> update(User user) 
	{
		Query query = getSession().createQuery("update  User us set email=:email,pwd=:pwd,name=:name,dob=:dob where id=:id");

		query.setParameter("email", user.getEmail());
		query.setParameter("pwd",user.getPwd());
		query.setParameter("name",user.getName());
		query.setParameter("dob",user.getDob());

		query.executeUpdate();
		return getAllUser();
	}

	@Override
	public List<User> getUserById(Long id)
	{
		Query query = getSession().createQuery("From User us where id=:id");
		query.setParameter("id",id);
		List<User> userList=query.list();
		return userList;

	}

	@Override
	public String getUserEmail(String email)
	{
		Query query = getSession().createQuery("Select us.email From User us where email=:email");
		query.setParameter("email", email);
		String emailId=(String) query.uniqueResult();
		return emailId;
	}

	@Override
	public String getUserPassword(String email)
	{
		Query query = getSession().createQuery("Select us.pwd From User us where email=:email");
		query.setParameter("email", email);
		String password=(String) query.uniqueResult();
		return password;
	}

	
}
