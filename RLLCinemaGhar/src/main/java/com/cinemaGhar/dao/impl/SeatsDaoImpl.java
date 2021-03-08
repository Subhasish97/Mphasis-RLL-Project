package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.SeatsDao;
import com.cinemaGhar.dao.entity.Seats;

//*****************************************************************************
//****************SEATS DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
@Repository
@EnableTransactionManagement
public class SeatsDaoImpl implements SeatsDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}

	//METHOD FOR CREATING AND INSERTING TO SEATS TABLE
	//------------------------------------------------
	@Override
	public boolean insert(Seats seat) 
	{
		getSession().saveOrUpdate(seat);
		System.out.println("admin " + seat.getTime()+" stored in the DB !!!");
		return true;
	}

	//METHOD FOR RETRIVING ALL SEATS ROW FROM SEATS TABLE
	//-----------------------------------------------------
	@Override
	public List<Seats> getAllSeats()
	{
		Query query = getSession().createQuery("select s from Seats s ");
		List<Seats>  seatList=query.list();
		return seatList;
	}

	//METHOD FOR RETRIVING A SEATS ROW BY SEAT ID FROM SEATS TABLE
	//-------------------------------------------------------------
	@Override
	public List<Seats> getSeatById(Long seatId)
	{
		Query query = getSession().createQuery("From Seats s where id:=id");
		query.setParameter("id",seatId);
		List<Seats> seatList=query.list();
		return seatList;
	}
	
}
