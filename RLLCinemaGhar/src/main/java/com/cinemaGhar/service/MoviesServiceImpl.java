package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.MoviesDao;
import com.cinemaGhar.dao.entity.Movies;

//*************************************************************************
//********************MOVIES SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class MoviesServiceImpl implements MoviesService {
	
	@Autowired
	private MoviesDao moviesDao;

	@Override
	public Boolean insert(Movies movie) {
		return moviesDao.insert(movie);
	}

	@Override
	public List<Movies> getAllMovies() {
		return moviesDao.getAllMovies();
	}

	@Override
	public List<Movies> getMovieById(Long id) {
		return moviesDao.getMovieById(id);
	}

}
