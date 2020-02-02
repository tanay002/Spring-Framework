package com.springmvc;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="udatad")
public class UserDto
{
	
private String uname;
private String upass;
private String umobile;
@Id
private String uemail;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getUmobile() {
	return umobile;
}
public void setUmobile(String umobile) {
	this.umobile = umobile;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}

UserDto()
{
}
public UserDto(String uname, String upass, String umobile, String uemail) {
	super();
	this.uname = uname;
	this.upass = upass;
	this.umobile = umobile;
	this.uemail = uemail;
}


}
