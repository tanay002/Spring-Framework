package com.bytecoder.mvc;

public class Company 
{
private int cId;
private String cName;

public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}

Company(int cId,String cName)
{
this.cId=cId;
this.cName=cName;
}
}
