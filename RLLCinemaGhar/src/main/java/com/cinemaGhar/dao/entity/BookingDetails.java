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
	
//	@Column(name="BOOK_AMT")
//	private String amount;
//	
//	@Column(name="BOOK_T_CNT")
//	private String count;
//	
//	@Column(name="BOOK_S_DTE")
//	private String showDate;
//	
//	@Column(name="BOOK_S_TME")
//	private String showTime;
//	

	@Column(name="BOOK_S")
	private String status;
	
	/*
	 * @Column(name="SEATS") private String seats;
	 * 
	 * @Column(name="USER") private String email;
	 * 
	 * @Column(name="THEATER") private String theater;
	 */
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "MOVIE_ID")
	private Movies movies;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "SEAT_ID")
	private Seats seat;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "TIME_ID")
	private ShowTimings showTimings;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "USER_ID")
	private User user;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "THEA_ID")
	private Theaters theaters;
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "PAY_ID")
	private PaymentInfo paymentInfo;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	public Seats getSeat() {
		return seat;
	}

	public void setSeat(Seats seat) {
		this.seat = seat;
	}

	public ShowTimings getShowTimings() {
		return showTimings;
	}

	public void setShowTimings(ShowTimings showTimings) {
		this.showTimings = showTimings;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Theaters getTheaters() {
		return theaters;
	}

	public void setTheaters(Theaters theaters) {
		this.theaters = theaters;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", date=" + date + ", time=" + time + ", status=" + status + ", movies="
				+ movies + ", seat=" + seat + ", showTimings=" + showTimings + ", user=" + user + ", theaters="
				+ theaters + ", paymentInfo=" + paymentInfo + "]";
	}

	
}

