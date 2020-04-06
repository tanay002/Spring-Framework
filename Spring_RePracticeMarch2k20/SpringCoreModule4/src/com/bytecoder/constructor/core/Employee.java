package com.bytecoder.constructor.core;

public class Employee
{
	private int eid;
	private String ename;

	public Employee(int eid)
	{
		this.eid=eid;	
	}

	public Employee(String ename)
	{
		this.ename=ename;	
	}

	public Employee(int eid,String ename)
	{
		this.eid=eid;	
		this.ename=ename;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}
	
	
}
