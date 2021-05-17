package com.bytecoder.core.setud;

public class Employees
{
	private int eid;
	private String ename;
	private String dname; //department name

	public Employees(int eid, String ename, String dname) {
		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", dname=" + dname + "]";
	}

	public int hashCode()
	{
		return (eid+" "+ename+" "+dname).hashCode();
	}

	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}
}
