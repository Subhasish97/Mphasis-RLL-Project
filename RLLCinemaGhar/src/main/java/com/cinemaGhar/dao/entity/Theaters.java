package com.cinemaGhar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="theaters")
public class Theaters{

	@Id
	@Column(name="THEA_ID")
	@NotNull
	private Long id;
		
	@Column(name="THEA_NAME")
	private String name;
	
	
	@Column(name="THEA_S_1")
	private String t1="02:30 PM";
	
	@Column(name="THEA_S_2")
	private String t2="06:00 PM";
	
		
	@Column(name="THEA_DTE")
	private String date;


	public Theaters() {
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


	public String getT1() {
		return t1;
	}


	public void setT1(String t1) {
		this.t1 = t1;
	}


	public String getT2() {
		return t2;
	}


	public void setT2(String t2) {
		this.t2 = t2;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Theaters [id=" + id + ", name=" + name + ", t1=" + t1 + ", t2=" + t2 + ", date=" + date + "]";
	}

	
}
	
	
	