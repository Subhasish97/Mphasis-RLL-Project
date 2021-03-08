package com.cinemaGhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinemaGhar.dao.api.MoviesDao;
import com.cinemaGhar.dao.entity.Admin;
import com.cinemaGhar.dao.entity.BookingDetails;
import com.cinemaGhar.dao.entity.Movies;
import com.cinemaGhar.dao.entity.PaymentInfo;
import com.cinemaGhar.dao.entity.Seats;
import com.cinemaGhar.dao.entity.ShowTimings;
import com.cinemaGhar.dao.entity.Theaters;
import com.cinemaGhar.dao.entity.Ticket;
import com.cinemaGhar.service.BookingDetailsService;
import com.cinemaGhar.service.MoviesService;
import com.cinemaGhar.service.PaymentInfoService;
import com.cinemaGhar.service.SeatsService;
import com.cinemaGhar.service.ShowTimingsService;
import com.cinemaGhar.service.TheaterService;
import com.cinemaGhar.service.TicketService;

//**********************************************************
//***********BOOKING REST CONTROLLER CLASS*********************
//**********************************************************

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookingRestController
{
	@Autowired
	MoviesService moviesService;
	
	@Autowired
	PaymentInfoService paymentInfoService;
	
	@Autowired
	SeatsService seatsService;
	
	@Autowired
	TicketService ticketService;
	
	@Autowired
	ShowTimingsService showTimingsService;
	
	@Autowired
	TheaterService theaterService;
	
	@Autowired
	BookingDetailsService bookingDetailsService;
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO MOVIE TABLE
	//*************************************************************
	@PostMapping("booking/createMovies")
	public Movies createMovies(@RequestBody Movies movies)
	{
		moviesService.insert(movies);
		return movies;
	
		
	}
	
	//REST-CONTROLLER METHOD TO GET THE MOVIES
	//****************************************
	@GetMapping("booking/getMovies")
	public List<Movies> getMovies()
	{
		return moviesService.getAllMovies();
		
		
	}
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO PAYMENT-INFO TABLE
	//*********************************************************************
	@PostMapping("booking/createPaymentInfo")
	public PaymentInfo createPaymentInfo(@RequestBody PaymentInfo paymentInfo)
	{
		paymentInfoService.insert(paymentInfo);
		return paymentInfo;
		
	}
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO SEATS TABLE
	//*************************************************************
	
	@PostMapping("booking/createSeats")
	public Seats createSeats(@RequestBody Seats seats)
	{
		seatsService.insert(seats);
		return seats;
		
	}
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO SHOW-TIMING TABLE
	//********************************************************************
	@PostMapping("booking/createShowTimings")
	public ShowTimings createShowTimings(@RequestBody ShowTimings showTimings)
	{
		showTimingsService.insert(showTimings);
		return showTimings;
		
	}
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO THEATERS TABLE
	//*****************************************************************
	@PostMapping("booking/createTheaters")
	public Theaters createShowTimings(@RequestBody Theaters theaters)
	{
		theaterService.insert(theaters);
		return theaters;
		
	}
	
	//REST-CONTROLLER METHOD FOR INSERTING THE VALUES TO BOOKING-DETAILS TABLE
	//************************************************************************
	@PostMapping("booking/createBookingDetails")
	public BookingDetails createBookingDetails(@RequestBody BookingDetails bookingDetails)
	{
		bookingDetailsService.insert(bookingDetails);
		return bookingDetails;
		
	}
	
	//REST-CONTROLLER METHOD GET ALL THE LAST INSERTED IDS
	//****************************************************
	@GetMapping("booking/getIds")
	public List<Long> getIds()
	{
		return bookingDetailsService.getIds();
	}
	
	//REST-CONTROLLER METHOD TO CREATE TICKET TABLE
	//*********************************************
	@GetMapping("booking/createTicket")
	public List<String> createTickets()
	{
		return bookingDetailsService.getTicket();
	}
	
	//REST-CONTROLLER METHOD TO GET THE TICKET
	//****************************************
	@GetMapping("booking/getTicket")
	public List<Ticket> getTickets()
	{
		return ticketService.getAllTickets();
	}
	
	//REST-CONTROLLER METHOD TO GET THE TICKET BY TICKET ID
	//*****************************************************
	@GetMapping("booking/getTicketById/{ticketId}")
	public List<Ticket> getTicketById(@PathVariable("ticketId") Long ticketId)
	{
		return ticketService.getTicketByNumber(ticketId);
	}
	
	//REST-CONTROLLER METHOD TO GET THE LAST INSERTED TICKET
	//******************************************************
	@GetMapping("booking/getLastInsertedTicket")
	public List<Ticket> getLastInsertedTicket()
	{
		return ticketService.getLastInsertedTicket();
	}

}
