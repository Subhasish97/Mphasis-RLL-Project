package com.cinemaGhar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//**********************************************************
//****************TICKET ENTITY CLASS************************
//**********************************************************
@Entity
@Table(name="Ticket")
public class Ticket
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="TICKET_ID")
	@NotNull
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MOVIE_NAME")
	private String movName;
	
	@Column(name="THEATER_NAME")
	private String theaterName;
	
	@Column(name="SEAT_NO")
	private String seatNo;
	
	@Column(name="BOOKING_DATE")
	private String bookDate;
	
	@Column(name="STATUS")
	private String status;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovName() {
		return movName;
	}

	public void setMovName(String movName) {
		this.movName = movName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", movName=" + movName + ", theaterName=" + theaterName
				+ ", seatNo=" + seatNo + ", bookDate=" + bookDate + ", status=" + status + "]";
	}
	
	
	

}
