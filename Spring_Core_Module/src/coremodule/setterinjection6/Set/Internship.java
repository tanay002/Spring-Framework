package coremodule.setterinjection6.Set;

import java.util.Iterator;
import java.util.Set;

public class Internship
{
	private String cname;
	private String course;
	private Set<Student> stud;
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public Set<Student> getStud()
	{
		return stud;
	}
	public void setStud(Set<Student> stud) 
	{
		this.stud = stud;
	}

	public String toString() 
	{
		return "cname="+cname+" course="+course+" Student"+stud;
	}

	public void displayInfo()
	{
		Iterator<Student> it=stud.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
