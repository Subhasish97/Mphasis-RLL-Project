package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.TheatersDao;
import com.cinemaGhar.dao.entity.Theaters;

@Repository
@EnableTransactionManagement
public class TheatersDaoImpl implements TheatersDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	
	}
	

	@Override
	public boolean insert(Theaters theater) 
	{
		getSession().saveOrUpdate(theater);
		System.out.println(theater.getId()+" "+ theater.getName());
		return true;
	}

	@Override
	public List<Theaters> getAllTheaters() 
	{
		Query query = getSession().createQuery("select th from Theaters th ");
		List<Theaters> theaterList=query.list();
		return theaterList;

	}

	@Override
	public List<Theaters> getTheaterById(Long theaterId) 
	{
		Query query = getSession().createQuery("From Theaters th where id:=id");
		query.setParameter("id",theaterId);
		List<Theaters> theaterList=query.list();
		return theaterList;
	}
	
}
