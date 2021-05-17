package coremodule.setterinjection8.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trainer
{
	private int tid;
	private String tname;
	private Map<Course,Experience> data;


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public Map<Course, Experience> getData() {
		return data;
	}


	public void setData(Map<Course, Experience> data) {
		this.data = data;
	}


	public void displayInfo()
	{
		Set<Entry<Course, Experience>> s=data.entrySet();   
		Iterator<Entry<Course,Experience>> it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Course, Experience> e=(Map.Entry<Course, Experience>)it.next();
			Course c=e.getKey()	;
			Experience ex=e.getValue();
			System.out.println(c+" "+ex);
		}	
	}

}