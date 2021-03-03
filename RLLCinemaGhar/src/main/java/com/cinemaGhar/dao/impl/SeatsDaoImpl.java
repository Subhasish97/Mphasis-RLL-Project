package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.SeatsDao;
import com.cinemaGhar.dao.entity.Seats;

@Repository
@EnableTransactionManagement
public class SeatsDaoImpl implements SeatsDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}

	@Override
	public boolean insert(Seats seat) 
	{
		try {

			getSession().saveOrUpdate(seat);
			System.out.println("admin " + seat.getTime()+" stored in the DB !!!");
			return true;

		} catch (Exception e) {

			System.out.println("Exception(ADD): " + e);
			return false;

		}
	}

	@Override
	public List<Seats> getAllSeats()
	{
		Query query = getSession().createQuery("select s from Seats s ");
		List<Seats>  seatList=query.list();
		return seatList;
	}

	@Override
	public List<Seats> getSeatById(String seatId)
	{
		Query query = getSession().createQuery("From Seats s where id:=id");
		query.setParameter("id",seatId);
		List<Seats> seatList=query.list();
		return seatList;
	}
	
}
