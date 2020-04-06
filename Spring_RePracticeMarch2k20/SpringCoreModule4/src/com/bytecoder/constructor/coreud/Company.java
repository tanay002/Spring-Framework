package com.bytecoder.constructor.coreud;

public class Company
{
	private String cmp;

	public Company(String cmp)
	{
		this.cmp=cmp;	
	}

	@Override
	public String toString() {
		return " "+cmp;
	}
	
	
}
