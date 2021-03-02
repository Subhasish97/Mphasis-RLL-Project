package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.Movies;

public interface MoviesDao
{
	public boolean insert(Movies movie);
	public List<Movies> getAllMovies();
	public List<Movies> getMovieById(String movieId);
	
}
