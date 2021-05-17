package coremodule.setterinjection3.List;

import java.util.Iterator;
import java.util.List;

public class Student 
{
	private int sid;
	private String sname;
	private List<String> hobby;
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
	
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	public String toString()
	{
		return "sid="+sid+" sname="+sname+" hobby"+hobby;
	}
	public void displayInfo(){  
	    System.out.println("Hobbies are:");  
	    Iterator<String> itr=hobby.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  

}
