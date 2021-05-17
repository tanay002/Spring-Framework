package com.bytecoder.core.mapud;

public class Questions 
{
	private int qno;
	private String que;

	public Questions(int qno, String que) {
		super();
		this.qno = qno;
		this.que = que;
	}
	public String toString()
	{
		return qno+": "+que;	
	}
	
	public int hashCode()
	{
		return (qno+" "+que).hashCode();
	}
	
	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}


}
