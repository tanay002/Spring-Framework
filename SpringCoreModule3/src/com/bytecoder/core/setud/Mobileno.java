package com.bytecoder.core.setud;

public class Mobileno
{
private Long mobno;
private int countrycode;
public Long getMobno() {
	return mobno;
}

public void setMobno(Long mobno) {
	this.mobno = mobno;
}

public int getCountrycode() {
	return countrycode;
}

public void setCountrycode(int countrycode) {
	this.countrycode = countrycode;
}

@Override
public String toString() {
	return "Mobileno [mobno=" + mobno + ", countrycode=" + countrycode + "]";
}

public int hashCode()
{
return (""+mobno+countrycode).hashCode();	
}

public boolean equals(Object o)
{
if(this.hashCode()==o.hashCode())
	return true;
else
	return false;
}
}
