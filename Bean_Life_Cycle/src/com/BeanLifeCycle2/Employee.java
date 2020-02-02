package com.BeanLifeCycle2;

public class Employee
{
	private int eid;
	private String ename;

	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public void initMethod() throws Exception
	{
      System.out.println("Inside initMethod are called after properties are set");
	}

	public void destroyMethod() throws Exception
	{
     System.out.println("DestroyMethod after called after all resources are closed i.e context are closed");
	}

	public String toString() 
	{
		return "eid="+eid+ " ename="+ename;
	}

}
