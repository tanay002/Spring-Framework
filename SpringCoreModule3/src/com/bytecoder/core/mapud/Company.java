package com.bytecoder.core.mapud;

import java.util.Map;

public class Company 
{
private int cid;
private String cname;
private Map<UniqueCode,Product> pname; //product_name
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
public Map<UniqueCode, Product> getPname() {
	return pname;
}
public void setPname(Map<UniqueCode, Product> pname) {
	this.pname = pname;
}

}
