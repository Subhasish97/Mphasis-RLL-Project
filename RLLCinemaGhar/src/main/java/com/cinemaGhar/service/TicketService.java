package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.Ticket;

//*************************************************************************
//********************TICKETS SERVICE INTERFACE******************************
//*************************************************************************
public interface TicketService 
{
	public List<Ticket> getTicketByNumber(Long ticketId) ;
	public List<Ticket> getAllTickets() ;
	public List<Ticket> getLastInsertedTicket();

}
