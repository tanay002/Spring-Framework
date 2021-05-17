package com.bytecoder.core.listud;

import java.util.List;

public class Employee
{
	private int eid;
	private String ename;
	private List<PersonalMail> pmail;

	public Employee(int eid, String ename, List<PersonalMail> pmail) {
		this.eid = eid;
		this.ename = ename;
		this.pmail = pmail;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public List<PersonalMail> getPmail() {
		return pmail;
	}


}
