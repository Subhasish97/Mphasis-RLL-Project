package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.AdminDao;
import com.cinemaGhar.dao.api.TicketDao;
import com.cinemaGhar.dao.entity.Ticket;

//*************************************************************************
//********************TICKET SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class TicketServiceImpl implements TicketService
{
	@Autowired
	private TicketDao ticketDao;

	@Override
	public List<Ticket> getTicketByNumber(Long ticketId) 
	{
		return ticketDao.getTicketByNumber(ticketId);
		
	}

	@Override
	public List<Ticket> getAllTickets()
	{
		return ticketDao.getAllTickets();
	}

	@Override
	public List<Ticket> getLastInsertedTicket() {
		return ticketDao.getLastInsertedTicket();
	}

}
