package coremodule.setterinjection6.Set;

public class Student 
{
	private String sname;
	private int enrollid;

	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public int getEnrollid()
	{
		return enrollid;
	}
	public void setEnrollid(int enrollid) 
	{
		this.enrollid = enrollid;
	}

	public String toString() {
		return "sname="+sname+" enrollid="+enrollid;
	}

}
