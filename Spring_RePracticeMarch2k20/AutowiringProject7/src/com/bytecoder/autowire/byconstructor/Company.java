package com.bytecoder.autowire.byconstructor;

public class Company 
{
	private Product product;

	public Company(Product product)
	{
		this.product=product;	
	}
	
	public String toString()
	{
		return ""+product;
	}
}
