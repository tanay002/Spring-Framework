package com.bytecoder.core.map;

import java.util.Map;

public class Company
{
	private int cid;
	private String cname;
	private Map<Integer,String> cproduct;
	
	public Company(int cid, String cname, Map<Integer, String> cproduct) {
		super();
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
	public Map<Integer, String> getCproduct() {
		return cproduct;
	}
	

	
}
