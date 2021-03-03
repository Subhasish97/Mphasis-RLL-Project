package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.BookingDetailsDao;
import com.cinemaGhar.dao.entity.BookingDetails;

@Repository
@EnableTransactionManagement
public class BookingDetailsDaoImpl implements BookingDetailsDao 
{
	
	public BookingDetailsDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}

	@Override
	public boolean insert(BookingDetails bd)
	{
		try
		{
			getSession().saveOrUpdate(bd);
			System.out.println("admin " + bd.getMovie()+" stored in the DB !!!");
			return true;
		} 
		catch (Exception e)
		{
			System.out.println("Exception(ADD): " + e);
			return false;
		}
	}

	@Override
	public List<BookingDetails> getAllBookingDetails()
	{
		Query query = getSession().createQuery("select bd from BookingDeatils bd");
		List<BookingDetails> bookingDetailsList=query.list();
		return bookingDetailsList;
	}

	@Override
	public List<BookingDetails> getAllBookingByUser(String email) 
	{
		Query query = getSession().createQuery("From BookingDetails where email =:email");
		query.setParameter("email", email);
		
		List<BookingDetails> bookingDetailsList=query.list();
		if(bookingDetailsList.isEmpty()) {
			System.out.println("Booking Details not Found!!");
		}
		return  bookingDetailsList;

	}

	@Override
	public List<BookingDetails> getBookingDetailById(String bookingDetailId)
	{
		Query query = getSession().createQuery("From BookingDetails where id =:id");
		query.setParameter("id", bookingDetailId);
		
		List<BookingDetails> bookingDetailsList=query.list();
		if(bookingDetailsList.isEmpty()) {
			System.out.println("Booking Details not Found!!");
		}
		return  bookingDetailsList;
		
	}

}
