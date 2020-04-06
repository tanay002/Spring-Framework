package com.bytecoder.core.mapud;

public class UniqueCode
{
private int uno;
private String ucode;

public int getUno() {
	return uno;
}
public void setUno(int uno) {
	this.uno = uno;
}
public String getUcode() {
	return ucode;
}
public void setUcode(String ucode) {
	this.ucode = ucode;
} 

public String toString()
{
return " "+uno+" "+ucode+" ";	
}

public int hashCode()
{
	return (" "+uno+" "+ucode+" ").hashCode();
}

public  boolean equals(Object o)
{
if(this.hashCode()==o.hashCode())
	return true;
else
	return false;
}
}
