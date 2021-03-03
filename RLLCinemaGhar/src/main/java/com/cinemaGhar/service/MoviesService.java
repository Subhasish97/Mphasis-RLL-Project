package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.Movies;

public interface MoviesService {
	
	public Boolean insert(Movies movie);
	public List<Movies> getAllMovies();
	public List<Movies> getMovieById(String id);

}
