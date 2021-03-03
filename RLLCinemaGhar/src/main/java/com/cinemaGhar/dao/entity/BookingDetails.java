package com.cinemaGhar.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="booking_details")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOK_ID")
	@NotNull
	private String id;
	
	@Column(name="BOOK_DATE")
	private String date;
	
	@Column(name="BOOK_TIME")
	private String time;
	
	@Column(name="BOOK_AMT")
	private String amount;
	
	@Column(name="BOOK_T_CNT")
	private String count;
	
	@Column(name="BOOK_S_DTE")
	private String showDate;
	
	@Column(name="BOOK_S_TME")
	private String showTime;
	
	@Column(name="MOVIE")
	private String movie;
	
	@Column(name="BOOK_S")
	private String status;
	
	@Column(name="SEATS")
	private String seats;
	
	@Column(name="USER")
	private String email;
	
	@Column(name="THEATER")
	private String theater;

	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTheater() {
		return theater;
	}

	public void setCinema(String theater) {
		this.theater = theater;
	}

	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", date=" + date + ", time=" + time + ", amount=" + amount + ", count="
				+ count + ", showDate=" + showDate + ", showTime=" + showTime + ", movie=" + movie + ", status="
				+ status + ", seats=" + seats + ", email=" + email + ", theater=" + theater + "]";
	}
	
	
}

