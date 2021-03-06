package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.BookingDetails;

//******************************************************************
//*******************BOKING-DETAILS DAO LAYER FOR CLIENT*********************
//******************************************************************
public interface BookingDetailsDao 
{
	public boolean insert(BookingDetails bd);
	public List<BookingDetails> getAllBookingDetails();
	public List<BookingDetails> getAllBookingByUser(String email);
	public List<BookingDetails> getBookingDetailById(Long bookingDetailId);
	public List<Long> getIds();
	public List<String> getTicket();
	
}
