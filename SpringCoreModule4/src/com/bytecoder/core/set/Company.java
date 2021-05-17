package com.bytecoder.core.set;

import java.util.Set;

public class Company
{
	private int cid;
	private String cname;
	private Set<String> cproduct;
	
	
	
	public Company(int cid, String cname, Set<String> cproduct) {
		this.cid = cid;
		this.cname = cname;
		this.cproduct = cproduct;
	}
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public Set<String> getCproduct() {
		return cproduct;
	}
	
	
}
