package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.Theaters;

//*************************************************************************
//********************THEATERS SERVICE INTERFACE******************************
//*************************************************************************
public interface TheaterService {
	
	public Boolean insert(Theaters theater);
	public List< Theaters> getAllTheaters ();
	public  List<Theaters> getTheaterById(Long id);

}
