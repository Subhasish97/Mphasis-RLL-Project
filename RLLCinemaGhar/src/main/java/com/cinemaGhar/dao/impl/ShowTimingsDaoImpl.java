package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.ShowTimingsDao;
import com.cinemaGhar.dao.entity.ShowTimings;

//*****************************************************************************
//****************SHOW-TIMINGS DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
@Repository
@EnableTransactionManagement
public class ShowTimingsDaoImpl implements ShowTimingsDao
{
	@Autowired
	SessionFactory sessionFactory;

	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}	

	//METHOD FOR CREATING AND INSERTING TO SHOWTIMINGS TABLE
	//------------------------------------------------------
	@Override
	public boolean insert(ShowTimings show)
	{
		getSession().saveOrUpdate(show);
		System.out.println("admin " + show.getTime()+" stored in the DB !!!");
		return true;
	}

	//METHOD FOR RETRIVING ALL SHOW-TIMINGS ROW FROM SHOWTIMINGS TABLE
	//-------------------------------------------------------------
	@Override
	public List<ShowTimings> getAllShowTimings() 
	{
		Query query =getSession().createQuery("select st from ShowTimings st ");
		List<ShowTimings> showList=query.list();
		return showList;
	}

	//METHOD FOR RETRIVING A SHOWTIMINGS ROW BY SHOWTIMING-ID FROM SHOWTIMINGS TABLE
	//--------------------------------------------------------------------------------
	@Override
	public List<ShowTimings> getShowById(Long showId) 
	{
		Query query = getSession().createQuery("From ShowTimings st where id:=id");
		query.setParameter("id",showId);
		List<ShowTimings> showList=query.list();
		return showList;
	}

}
