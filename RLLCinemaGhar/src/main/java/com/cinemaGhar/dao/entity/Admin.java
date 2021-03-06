package com.cinemaGhar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="admin_info")
public class Admin{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="ADMIN_ID")
	@NotNull
	private Long id;
	
	@Column(name="ADMIN_NAME")
	private String name;
	
	@Column(name="ADMIN_GENDER")
	private String gender;
	
	@Column(name="ADMIN_EMAIL")
	private String email;
	
	@Column(name="ADMIN_PWD")
	private String pwd;
	
	@Column(name="enabled")
	private int enabled=1;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Admin(long id, String name, String gender, String email, String pwd, int enabled) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.pwd = pwd;
		this.enabled = enabled;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", pwd=" + pwd
				+ ", enabled=" + enabled + "]";
	}
	
	
	
}

