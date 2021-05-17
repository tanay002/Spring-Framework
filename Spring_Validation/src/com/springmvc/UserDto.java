package com.springmvc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Validation;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="udatad")
public class UserDto extends Validation
{
	@NotEmpty(message = "name can't be blank")
private String uname;

	@Min(value = 6,message ="Password length should be above 6 digit")
@Max(value=12,message ="Password length should not be more than 12 digits")
private String upass;

@NotEmpty(message="mobile no can't be blank")
@Min(value =10,message ="mobile length should be 10 digit")
@Max(value=10,message ="mobile length should be 10 digit")
private String umobile;
@Id
@NotEmpty(message="email can't be blanked")
@Email(message = "Enter valid Email")
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
