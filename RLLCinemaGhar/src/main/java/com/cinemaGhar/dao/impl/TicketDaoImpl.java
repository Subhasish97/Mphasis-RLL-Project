package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.TicketDao;
import com.cinemaGhar.dao.entity.Ticket;
import com.cinemaGhar.dao.entity.User;

//*****************************************************************************
//****************TICKETS DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
@Repository
@EnableTransactionManagement
public class TicketDaoImpl implements TicketDao 
{
	@Autowired
	private SessionFactory sessionFactory;

	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}


	//METHOD FOR RETRIVING A TICKET ROW BY TICKET ID FROM TICKETS TABLE
	//-------------------------------------------------------------- 
	@Override
	public List<Ticket> getTicketByNumber(Long ticketId) 
	{
		Query query = getSession().createQuery("From Ticket tk where id=:id");
		query.setParameter("id",ticketId);
		List<Ticket> userTicket=query.list();
		return userTicket;
	}

	//METHOD FOR RETRIVING ALL TICKETS ROW FROM TICKETS TABLE
	//-------------------------------------------------------------
	@Override
	public List<Ticket> getAllTickets() 
	{
		Query query = getSession().createQuery("select tk from Ticket tk ");
		List<Ticket> ticketList=query.list();
		return ticketList;
	}


	//METHOD FOR RETRIVING LAST INSERTED TICKET ROW FROM TICKETS TABLE
	//-------------------------------------------------------------
	@Override
	public List<Ticket> getLastInsertedTicket()
	{
		Query query = getSession().createQuery("select max(tk.id) from Ticket tk");
		Long ticketId=(Long) query.uniqueResult();
		
		Query query2 = getSession().createQuery("From Ticket tk where id=:id");
		query2.setParameter("id",ticketId);
		List<Ticket> userTicket=query2.list();
		return userTicket;
		
	}

}
