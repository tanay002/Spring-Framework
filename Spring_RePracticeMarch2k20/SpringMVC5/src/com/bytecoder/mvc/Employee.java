package com.bytecoder.mvc;

public class Employee 
{
	private int eId;
	private String eName;
	private String eCity;
	private String eEmail;
	private String ePass;
	
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String getePass() {
		return ePass;
	}
	public void setePass(String ePass) {
		this.ePass = ePass;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public Employee(int eId, String eName, String eCity) {
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	Employee()
	{

	}
}
