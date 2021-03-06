package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.Seats;

public interface SeatsService {
	
	public Boolean insert(Seats seat);
	public List<Seats> getAllSeats();
	public List<Seats> getSeatById(Long seatId);

}
