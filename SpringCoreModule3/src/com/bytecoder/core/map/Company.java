package com.bytecoder.core.map;

import java.util.Map;

public class Company 
{
private int cid;
private String cname;
private Map<Integer,String> pname; //product_name
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Map<Integer, String> getPname() {
	return pname;
}
public void setPname(Map<Integer, String> pname) {
	this.pname = pname;
}


}
