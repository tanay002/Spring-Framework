package com.bytecoder.autowire.byname;

public class Product 
{
private int productCode;
private String productName;

public int getProductCode() {
	return productCode;
}
public void setProductCode(int productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

public String toString()
{
return productCode+" "+productName;	
}
}
