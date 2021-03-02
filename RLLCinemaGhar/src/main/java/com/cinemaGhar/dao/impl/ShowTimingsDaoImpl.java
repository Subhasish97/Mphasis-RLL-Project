package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cinemaGhar.dao.api.ShowTimingsDao;
import com.cinemaGhar.dao.entity.ShowTimings;

public class ShowTimingsDaoImpl implements ShowTimingsDao
{
	@Autowired
	SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}	

	@Override
	public boolean insert(ShowTimings show)
	{
		try {

			getSession().saveOrUpdate(show);
			System.out.println("admin " + show.getTime()+" stored in the DB !!!");
			return true;

		} catch (Exception e) {

			System.out.println("Exception(ADD): " + e);
			return false;

		}
	}

	@Override
	public List<ShowTimings> getAllShowTimings() 
	{
		Query query =getSession().createQuery("select st from ShowTimings st ");
		List<ShowTimings> showList=query.list();
		return showList;
	}

	@Override
	public List<ShowTimings> getShowById(String showId) 
	{
		Query query = getSession().createQuery("From ShowTimings st where id:=id");
		query.setParameter("id",showId);
		List<ShowTimings> showList=query.list();
		return showList;
	}

}
