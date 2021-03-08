package com.cinemaGhar.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.BookingDetailsDao;
import com.cinemaGhar.dao.entity.BookingDetails;
import com.cinemaGhar.dao.entity.Ticket;

//*****************************************************************************
//****************BOOKING-DETAILS DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
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

	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}

	//METHOD FOR CREATING AND INSERTING TO BOOKING DETAILS TABLE
	//----------------------------------------------------------
	@Override
	public boolean insert(BookingDetails bd)
	{

		getSession().saveOrUpdate(bd);
		System.out.println("admin " + bd.getDate()+" stored in the DB !!!");
		return true;
	}

	//METHOD FOR RETRIVING ALL  BOOKING DETAILS FROM THE TABLE
	//----------------------------------------------------------
	@Override
	public List<BookingDetails> getAllBookingDetails()
	{
		Query query = getSession().createQuery("select bd from BookingDeatils bd");
		List<BookingDetails> bookingDetailsList=query.list();
		return bookingDetailsList;
	}

	//METHOD FOR RETRIVING ALL  BOOKING DETAILS FROM THE TABLE BY USER-ID
	//-------------------------------------------------------------------
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

	//METHOD FOR RETRIVING ALL  BOOKING DETAILS FROM THE TABLE BY BOOKING-ID
	//----------------------------------------------------------------------
	@Override
	public List<BookingDetails> getBookingDetailById(Long bookingDetailId)
	{
		Query query = getSession().createQuery("From BookingDetails where id =:id");
		query.setParameter("id", bookingDetailId);
		
		List<BookingDetails> bookingDetailsList=query.list();
		if(bookingDetailsList.isEmpty()) {
			System.out.println("Booking Details not Found!!");
		}
		return  bookingDetailsList;
		
	}

	//METHOD FOR RETRIVING ALL LAST INSERTED ID FROM THE  TICKET TABLE 
	//-------------------------------------------------------------------
	@Override
	public List<Long> getIds() 
	{
		Query query = getSession().createQuery("select max(us.id) from User us");
		Long userId=(Long) query.uniqueResult();
		Query query2 = getSession().createQuery("select max(th.id) from Theaters th");
		Long theaterId=(Long) query2.uniqueResult();
		Query query3 = getSession().createQuery("select max(mv.id) from Movies mv");
		Long movieId=(Long) query3.uniqueResult();
		Query query4 = getSession().createQuery("select max(py.id) from PaymentInfo py");
		Long paymentId=(Long) query4.uniqueResult();
		Query query5 = getSession().createQuery("select max(se.id) from Seats se");
		Long seatId=(Long) query5.uniqueResult();
		Query query6 = getSession().createQuery("select max(tm.id) from ShowTimings tm");
		Long timeId=(Long) query6.uniqueResult();
		
		List<Long> ids= new ArrayList<Long>();
		
		ids.add(movieId);
		ids.add(paymentId);
		ids.add(seatId);
		ids.add(timeId);
		ids.add(theaterId);
		ids.add(userId);
		
		
		return ids;
		
	}

	//METHOD FOR CREATING THE TICKETS TABLE AND RETRIVE  FROM THE  TICKET TABLE 
	//-------------------------------------------------------------------------
	@Override
	public List<String> getTicket()
	{
		List<String> ticket=new ArrayList<String>();
		Ticket getTick=new Ticket();
		
		Query query = getSession().createQuery("select max(us.id) from User us");
		Long userId=(Long) query.uniqueResult();
		Query query2 = getSession().createQuery("select max(th.id) from Theaters th");
		Long theaterId=(Long) query2.uniqueResult();
		Query query3 = getSession().createQuery("select max(mv.id) from Movies mv");
		Long movieId=(Long) query3.uniqueResult();
		Query query4 = getSession().createQuery("select max(py.id) from PaymentInfo py");
		Long paymentId=(Long) query4.uniqueResult();
		Query query5 = getSession().createQuery("select max(se.id) from Seats se");
		Long seatId=(Long) query5.uniqueResult();
		Query query6 = getSession().createQuery("select max(tm.id) from ShowTimings tm");
		Long timeId=(Long) query6.uniqueResult();
		
		Query query7 = getSession().createQuery("select us.name from User us where id=:id");
		query7.setParameter("id", userId);
		String name=(String) query7.uniqueResult();
		
		Query query8 = getSession().createQuery("select mv.title from Movies mv where id=:id");
		query8.setParameter("id", movieId);
		String movieName=(String) query8.uniqueResult();
		
		Query query9 = getSession().createQuery("select th.name from Theaters th where id=:id");
		query9.setParameter("id", theaterId);
		String theaterName=(String) query9.uniqueResult();
		
		
		
		Query query10 = getSession().createQuery("select s.seatNumber from Seats s where id=:id");
		query10.setParameter("id", seatId);
		String seatNo=(String) query10.uniqueResult();
		
		Query query11 = getSession().createQuery("select th.date from Theaters th where id=:id");
		query11.setParameter("id", theaterId);
		String date=(String) query11.uniqueResult();
		
		Query query12 = getSession().createQuery("select s.status from Seats s where id=:id");
		query12.setParameter("id", seatId);
		String status=(String) query12.uniqueResult();
		
		ticket.add(name);
		ticket.add(movieName);
		ticket.add(theaterName);
		ticket.add(seatNo);
		ticket.add(date);
		ticket.add(status);
		
		getTick.setName(name);
		getTick.setMovName(movieName);
		getTick.setTheaterName(theaterName);
		getTick.setSeatNo(seatNo);
		getTick.setBookDate(date);
		getTick.setStatus(status);
		
		getSession().saveOrUpdate(getTick);
		System.out.println("Ticket " + getTick.getMovName()+" stored in the DB !!!");
		
		System.out.println(name+" "+movieName+" "+theaterName+" "+seatNo+" "+date+" "+status);
		
		return ticket;
		
	}

}
