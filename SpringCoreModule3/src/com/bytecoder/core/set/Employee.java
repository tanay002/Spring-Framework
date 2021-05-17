package com.bytecoder.core.set;

import java.util.Set;

public class Employee 
{
private int eid;
private String ename;
private Set<Long> mobno;

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
public Set<Long> getMobno() {
	return mobno;
}
public void setMobno(Set<Long> mobno) {
	this.mobno = mobno;
}


}
