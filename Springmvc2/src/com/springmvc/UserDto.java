package com.springmvc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;


@Entity
@Table(name="udatad")
public class UserDto
{
	/* @Size(min=2,max=20,message = "required") */
private String uname;

	/* @Size(min = 8,max=16) */
private String upass;

	/* @Size(min = 10,max=10) */
private String umobile;
@Id
	/* @NotEmpty @Email */
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
