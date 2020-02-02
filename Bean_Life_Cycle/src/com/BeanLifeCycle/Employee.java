package com.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean
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

	public void afterPropertiesSet() throws Exception
	{
      System.out.println("AfterPropertiesSet");
	}

	public void destroy() throws Exception
	{
     System.out.println("Destroy");
	}

	public String toString() 
	{
		return "eid="+eid+ " ename="+ename;
	}

}
