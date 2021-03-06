package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.MoviesDao;
import com.cinemaGhar.dao.entity.Movies;

@Repository
@EnableTransactionManagement
public class MoviesDaoImpl implements MoviesDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	
	}

	@Override
	public boolean insert(Movies movie) 
	{
		getSession().saveOrUpdate(movie);
		System.out.println(movie.getId()+" "+ movie.getTitle());
		return true;
	}

	@Override
	public List<Movies> getAllMovies() 
	{
		Query query = getSession().createQuery("select m from Movies m ");
		List<Movies> movieList=query.list();
		return movieList;
	}

	@Override
	public List<Movies> getMovieById(Long movieId) 
	{
		Query query = getSession().createQuery("From Movies m where id:=id");
		query.setParameter("id",movieId);
		List<Movies> movieList=query.list();
		return movieList;
		
	}
	
}
