package com.springmvc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="userdata") 
public class UserDto 
{
	private String uname;
	
	@Id
	private String uemail;
	private String umobno;
	private String upwd;

	public String getUname()
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	public String getUemail() 
	{
		return uemail;
	}
	public void setUemail(String uemail) 
	{
		this.uemail = uemail;
	}
	public String getUmobno() 
	{
		return umobno;
	}
	public void setUmobno(String umobno) 
	{
		this.umobno = umobno;
	}
	public String getUpwd() 
	{
		return upwd;
	}
	public void setUpwd(String upwd) 
	{
		this.upwd = upwd;
	}
}
