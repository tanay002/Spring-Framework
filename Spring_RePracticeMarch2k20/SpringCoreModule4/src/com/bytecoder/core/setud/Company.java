package com.bytecoder.core.setud;

import java.util.Set;

public class Company
{
	private int cid;
	private String cname;
	private Set<Employees> edetails;
	
	public Company(int cid, String cname, Set<Employees> edetails) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.edetails = edetails;
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public Set<Employees> getEdetails() {
		return edetails;
	}
	
	
	
	
}
