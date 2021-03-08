package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.ShowTimings;

//******************************************************************
//*******************SHOWTIMINGS LAYER FOR CLIENT*********************
//******************************************************************
public interface ShowTimingsDao
{
	public boolean insert(ShowTimings show);
	public List<ShowTimings> getAllShowTimings();
	public List<ShowTimings> getShowById(Long showId);

	
}
