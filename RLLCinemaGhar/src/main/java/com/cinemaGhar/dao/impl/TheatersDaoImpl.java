package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.TheatersDao;
import com.cinemaGhar.dao.entity.Theaters;

//*****************************************************************************
//****************THEATERS DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
@Repository
@EnableTransactionManagement
public class TheatersDaoImpl implements TheatersDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	
	}
	

	//METHOD FOR CREATING AND INSERTING TO THEATERS TABLE
	//------------------------------------------------
	@Override
	public boolean insert(Theaters theater) 
	{
		getSession().saveOrUpdate(theater);
		System.out.println(theater.getId()+" "+ theater.getName());
		return true;
	}

	//METHOD FOR RETRIVING ALL THEATERS ROW FROM THEATERS TABLE
	//-------------------------------------------------------------
	@Override
	public List<Theaters> getAllTheaters() 
	{
		Query query = getSession().createQuery("select th from Theaters th ");
		List<Theaters> theaterList=query.list();
		return theaterList;

	}

	//METHOD FOR RETRIVING A THEATERS ROW BY THEATERS ID FROM THEATERS TABLE
	//-----------------------------------------------------------------------
	@Override
	public List<Theaters> getTheaterById(Long theaterId) 
	{
		Query query = getSession().createQuery("From Theaters th where id:=id");
		query.setParameter("id",theaterId);
		List<Theaters> theaterList=query.list();
		return theaterList;
	}
	
}
