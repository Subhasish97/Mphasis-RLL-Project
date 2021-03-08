package com.cinemaGhar.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//**********************************************************
//****************BOOKING DETAILS ENTITY CLASS************************
//**********************************************************
@Entity
@Table(name="booking_details")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="BOOK_ID")
	@NotNull
	private Long id;
	
	@Column(name="BOOK_DATE")
	private String date;
	
	@Column(name="BOOK_TIME")
	private String time;

	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", date=" + date + ", time=" + time + "]";
	}

	
	
	
	

}

