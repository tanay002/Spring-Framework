package coremodule.setterinjection5.Set;

import java.util.Iterator;
import java.util.Set;

public class Employee 
{
	private int eid;
	private String ename;
	private Set<String> hobby;

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
	public Set<String> getHobby()
	{
		return hobby;
	}
	public void setHobby(Set<String> hobby) 
	{
		this.hobby = hobby;
	}

	public String toString() 
	{
		return "eid="+eid+" ename="+ename+" hobby="+hobby;
	}

	public void displayInfo()
	{
		         Iterator s =hobby.iterator();
		         while(s.hasNext())
		         {
		        	 System.out.println(s.next());
		         }
	
	}
}
