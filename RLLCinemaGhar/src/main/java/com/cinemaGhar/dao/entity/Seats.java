package com.cinemaGhar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//**********************************************************
//****************SEATS ENTITY CLASS************************
//**********************************************************
@Entity
@Table(name="seats")
public class Seats{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="SEAT_ID")
	@NotNull
	private Long id;
	
	@Column(name="SEAT_NUMBER")
	private String seatNumber;
	
	@Column(name="TIME")
	private String time;
	
	@Column(name="SEAT_STATUS")
	private String status;

	public Seats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
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

	@Override
	public String toString() {
		return "Seats [id=" + id + ", seatNumber=" + seatNumber + ", time=" + time + ", status=" + status + "]";
	}
	
	
}
