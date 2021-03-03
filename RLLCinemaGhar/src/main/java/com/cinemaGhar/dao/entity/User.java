package com.cinemaGhar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="user_info")
public class User{

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	@NotNull
	private String id;
		
	@Id
	@Column(name="USER_EMAIL")
	@NotNull
	private String email;
	
	@Column(name="USER_PWD")
	private String pwd;
	
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="USER_DOB")
	private String dob;
	
	@Column(name="USER_GENDER")
	private String gender;
	
	@Column(name="USER_REG_DTE")
	private String date;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", pwd=" + pwd + ", name=" + name + ", dob=" + dob + ", gender="
				+ gender + ", date=" + date + "]";
	}
	
	
}

