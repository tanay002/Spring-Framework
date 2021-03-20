package com.bytecoder.exception;

public class InvalidUser extends RuntimeException
{
	public InvalidUser(String msg) 
	{
		super(msg);
	}
}
