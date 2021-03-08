package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.cinemaGhar.dao.api.TheatersDao;
import com.cinemaGhar.dao.entity.Theaters;

//*************************************************************************
//********************THEATER SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class TheaterServiceImpl implements TheaterService{
	
	@Autowired
	private TheatersDao theaterDao;

	@Override
	public Boolean insert(Theaters theater) {
		return theaterDao.insert(theater);
	}

	@Override
	public List<Theaters> getAllTheaters() {
		return theaterDao.getAllTheaters();
	}

	@Override
	public List<Theaters> getTheaterById(Long id) {
		return theaterDao.getTheaterById(id);
	}

}
