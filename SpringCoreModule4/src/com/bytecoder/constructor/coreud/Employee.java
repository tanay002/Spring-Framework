package com.bytecoder.constructor.coreud;

public class Employee
{
	private int eid;
	private String ename;
	private Company cname;


	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Company getCname() {
		return cname;
	}
	
	public Employee(int eid, String ename, Company cname) {
		this.eid = eid;
		this.ename = ename;
		this.cname = cname;
	}
	
	
}
