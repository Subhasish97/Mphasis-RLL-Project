package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.Theaters;

public interface TheatersDao
{
	public boolean insert(Theaters theater);
	public List<Theaters> getAllTheaters();
	public List<Theaters> getTheaterById(Long theaterId);
	
}
