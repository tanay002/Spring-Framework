package coremodule.setterinjection8.Map;

public class Course 
{
private String courses;
private int code;

public String getCourses() 
{
	return courses;
}
public void setCourses(String courses) 
{
	this.courses = courses;
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
	return "courses="+courses+" code="+code;
}


}
