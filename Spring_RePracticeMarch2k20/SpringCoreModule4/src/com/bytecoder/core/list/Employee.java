package com.bytecoder.core.list;

import java.util.List;

public class Employee 
{
private int empid;
private String empname;
private List<Long> mobno;



public Employee(int empid, String empname, List<Long> mobno) {
	this.empid = empid;
	this.empname = empname;
	this.mobno = mobno;
}
public int getEmpid() {
	return empid;
}
public String getEmpname() {
	return empname;
}
public List<Long> getMobno() {
	return mobno;
}
}