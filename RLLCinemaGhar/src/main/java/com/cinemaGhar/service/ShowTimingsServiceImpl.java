package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.ShowTimingsDao;
import com.cinemaGhar.dao.entity.ShowTimings;

//*************************************************************************
//********************SHOW-TIMINGS SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class ShowTimingsServiceImpl implements ShowTimingsService{
	
	@Autowired
	private ShowTimingsDao showTimingsDao;

	@Override
	public Boolean insert(ShowTimings show) {
		return showTimingsDao.insert(show);
	}

	@Override
	public List<ShowTimings> getAllShowTimings() {
		return showTimingsDao.getAllShowTimings();
	}

	@Override
	public List<ShowTimings> getShowTimingById(Long id) {
		return showTimingsDao.getShowById(id);
	}

}
