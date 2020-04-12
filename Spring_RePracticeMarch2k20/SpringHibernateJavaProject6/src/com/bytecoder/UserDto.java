package com.bytecoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empData2")
public class UserDto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uId;
	private String uName;
	private String uCity;

	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuCity() {
		return uCity;
	}
	public void setuCity(String uCity) {
		this.uCity = uCity;
	}
	
	public String toString() {
		return "uId=" + uId + " uName=" + uName + " uCity=" + uCity;
	}
	
	
	
}
