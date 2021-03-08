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
//****************SHOW-TIMINGS ENTITY CLASS************************
//**********************************************************
@Entity
@Table(name="show_timing")
public class ShowTimings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TIME_ID")
	@NotNull
	private Long id;
	
	@Column(name="TIME")
	private String time;

	public ShowTimings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ShowTimings [id=" + id + ", time=" + time + "]";
	}
	
	
}

