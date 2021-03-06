package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.ShowTimings;

public interface ShowTimingsService {
	
	public Boolean insert(ShowTimings show);
	public List<ShowTimings> getAllShowTimings();
	public List<ShowTimings> getShowTimingById(Long id);


}
