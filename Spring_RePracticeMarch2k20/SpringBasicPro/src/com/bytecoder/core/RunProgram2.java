package com.bytecoder.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunProgram2 
{
	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
         Company c=(Company) ap.getBean("cmp");
         System.out.println(c.getCregno()+" "+c.getCname());
        
	}
}
