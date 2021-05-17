package coremodule.setterinjection4.List;

public class Mobile
{
	private String number;
	private int code;
	
	
	public String getNumber()
	{
		return number;
	}
	public void setNumber(String number) 
	{
		this.number = number;
	}
	public int getCode()
	{
		return code;
	}
	public void setCode(int code) 
	{
		this.code = code;
	}

	public String toString() 
	{
		return "number="+number+" code="+code;
	}
	
}
