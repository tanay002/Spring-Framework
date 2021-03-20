package com.bytecoder.model;

import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDto
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uId;
	private String uEmail;
	private String fName;
	private String lName;
	

	private String uPassword;
	private String uCity;
	private String gender;
	private Date udob;
	
	
	public UserDto(int uId,String fName, String lName, String uEmail, String uPassword, String uCity, String gender,Date udob) 
	{
		this.uId = uId;
		this.fName = fName;
		this.lName = lName;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
		this.uCity = uCity;
		this.gender = gender;
		this.udob=udob;
	}
	
	public UserDto()
	{
		
	}
	
	
	public Date getUdob() {
		return udob;
	}

	public void setUdob(Date udob) {
		this.udob = udob;
	}

	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuCity() {
		return uCity;
	}
	public void setuCity(String uCity) {
		this.uCity = uCity;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
