package com.bytecoder.autowireanno.byconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company 
{
	private Product product;
     
	@Autowired(required=false)
	public Company(Product product)
	{
		this.product=product;	
	}
	
	public Company()
	{
		
	}
	public String toString()
	{
		return ""+product;
	}
}
