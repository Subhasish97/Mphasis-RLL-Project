package com.cinemaGhar.dao.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

//**********************************************************
//****************PAYMENT-INFO ENTITY CLASS************************
//**********************************************************
@Entity
@Table(name="payment_info")
public class PaymentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="PAY_ID")
	@NotNull
	private Long id;
	
	@Column(name="PAY_DATE")
	private String date;
	
	@Column(name="PAY_TIME")
	private String time;
	
	@Column(name="PAY_AMT")
	private String amount;

	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentInfo(Long id, String date, String time, String amount) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.amount = amount;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PaymentInfo [id=" + id + ", date=" + date + ", time=" + time + ", amount=" + amount + "]";
	}
	
	
}
