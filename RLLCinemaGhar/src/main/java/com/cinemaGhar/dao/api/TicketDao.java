package com.cinemaGhar.dao.api;

import java.util.List;
import com.cinemaGhar.dao.entity.Ticket;

//******************************************************************
//*******************TICKET DAO LAYER FOR CLIENT*********************
//******************************************************************
public interface TicketDao 
{
	public List<Ticket> getTicketByNumber(Long ticketId);
	public List<Ticket> getAllTickets();
	public List<Ticket> getLastInsertedTicket();

}
