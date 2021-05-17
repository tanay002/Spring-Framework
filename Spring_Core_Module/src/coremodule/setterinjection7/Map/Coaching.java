package coremodule.setterinjection7.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Coaching 
{
	private int cid;
	private String cname;
	private Map<Integer,String> courses;
	public int getCid() 
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public Map<Integer, String> getCourses() 
	{
		return courses;
	}
	public void setCourses(Map<Integer, String> courses)
	{
		this.courses = courses;
	}
	

	public String toString() 
	{
		return "cid="+cid+" cname="+cname+" courses="+courses;
	}
	
	public void displayInfo()
	{  
	    Set set=courses.entrySet();  
	    Iterator  itr=set.iterator();  
	    while(itr.hasNext())
	    {  
	        Map.Entry<Integer,String> e=(Map.Entry<Integer, String>) itr.next();  
	        System.out.println(e.getKey()+" "+e.getValue());  
	    }  
}
}