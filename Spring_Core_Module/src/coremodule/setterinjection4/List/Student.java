package coremodule.setterinjection4.List;

import java.util.Iterator;
import java.util.List;

public class Student 
{
	private int sid;
	private String sname;
	private List<Mobile> mobno;
	public int getSid() 
	{
		return sid;
	}
	public void setSid(int sid) 
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public List<Mobile> getMobno() 
	{
		return mobno;
	}
	public void setMobno(List<Mobile> mobno)
	{
		this.mobno = mobno;
	}

	public String toString() 
	{
		return "sid="+sid+" sname="+sname+" "+mobno;
	}

	public void displayInfo()
	{  
		Iterator<Mobile> itr=mobno.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
}