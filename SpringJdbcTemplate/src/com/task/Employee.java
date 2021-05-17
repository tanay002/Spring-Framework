package com.task;

public class Employee 
{
	private String ename;
	private int eid;
	private long esalary;
	private String ecity;
	

	public Employee(String ename,int eid,long esalary,String ecity)
	{
		this.ename=ename;
		this.eid=eid;
		this.setEcity(ecity);
		this.setEsalary(esalary);
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

	public long getEsalary() {
		return esalary;
	}

	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}


}
