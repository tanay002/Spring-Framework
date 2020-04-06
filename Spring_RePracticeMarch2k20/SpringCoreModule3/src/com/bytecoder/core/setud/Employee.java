package com.bytecoder.core.setud;

import java.util.Set;

public class Employee 
{
private int eid;
private String ename;
private Set<Mobileno> mobno;

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Set<Mobileno> getMobno() {
	return mobno;
}
public void setMobno(Set<Mobileno> mobno) {
	this.mobno = mobno;
}


}
