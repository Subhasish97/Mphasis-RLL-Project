package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.Seats;

//******************************************************************
//*******************SEATS DAO LAYER FOR CLIENT*********************
//******************************************************************
public interface SeatsDao 
{
	public boolean insert(Seats seat);
	public List<Seats> getAllSeats();
	public List<Seats> getSeatById(Long seatId);

}
