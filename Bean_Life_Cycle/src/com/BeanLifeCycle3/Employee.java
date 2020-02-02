package com.BeanLifeCycle3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
    @PostConstruct
	public void initMethod() throws Exception
	{
      System.out.println("Inside initMethod are called after properties are set");
	}
    @PreDestroy
	public void destroyMethod() throws Exception
	{
     System.out.println("DestroyMethod after called after all resources are closed i.e context are closed");
	}

	public String toString() 
	{
		return "eid="+eid+ " ename="+ename;
	}

}
