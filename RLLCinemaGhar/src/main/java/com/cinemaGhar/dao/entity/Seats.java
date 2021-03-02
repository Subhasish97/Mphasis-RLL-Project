package com.cinemaGhar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="seats")
public class Seats{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SEAT_ID")
	@NotNull
	private Long id;
	
	@Column(name="THEATER_KEY")
	private long theaterKey;
	
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

	public long getTheaterKey() {
		return theaterKey;
	}

	public void setTheaterKey(long theaterKey) {
		this.theaterKey = theaterKey;
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
		return "Seats [id=" + id + ", theaterKey=" + theaterKey + ", time=" + time + ", status=" + status + "]";
	}

	
}
