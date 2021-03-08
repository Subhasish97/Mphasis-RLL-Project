package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.BookingDetailsDao;
import com.cinemaGhar.dao.entity.BookingDetails;

//*************************************************************************
//********************BOOKING-DETAILS SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class BookingDetailsServiceImpl implements BookingDetailsService {
	
@Autowired
private BookingDetailsDao bookingDetailsDao;
	

	@Override
	public Boolean insert(BookingDetails bookingDetails) {
		return bookingDetailsDao.insert(bookingDetails);
	}

	@Override
	public List<BookingDetails> getAllBookingDetails() {
		return bookingDetailsDao.getAllBookingDetails();
	}

	@Override
	public List<BookingDetails> getBookingDeatilsByUser(String email) {
		return bookingDetailsDao.getAllBookingByUser(email);
	}

	@Override
	public List<BookingDetails> getBookingDetailsById(Long id) {
		return bookingDetailsDao.getBookingDetailById(id);
	}

	@Override
	public List<Long> getIds() {
		return bookingDetailsDao.getIds();
	}

	@Override
	public List<String> getTicket() {
		return bookingDetailsDao.getTicket();
	}

}
