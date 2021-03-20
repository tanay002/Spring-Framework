package com.bytecoder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="nationality")
public class NationalityDto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int nId;
private String nName;
private int isDeleted;

public int getnId() {
	return nId;
}
public void setnId(int nId) {
	this.nId = nId;
}
public String getnName() {
	return nName;
}
public void setnName(String nName) {
	this.nName = nName;
}
public int getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(int isDeleted) {
	this.isDeleted = isDeleted;
}

public NationalityDto()
{
	
}

public NationalityDto(int nId, String nName, int isDeleted) {
	super();
	this.nId = nId;
	this.nName = nName;
	this.isDeleted = isDeleted;
}



}
