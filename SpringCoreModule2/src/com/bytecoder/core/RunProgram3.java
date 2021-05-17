package com.bytecoder.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunProgram3
{
	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
       //object 1
		Company c=(Company) ap.getBean("cmp");
        System.out.println(c.getCregno()+" "+c.getCname());
		c.setCname("rajat");
        System.out.println(c.hashCode());
        
        //object 2
        Company c1=(Company) ap.getBean("cmp");
       System.out.println(c1.getCregno()+" "+c1.getCname());
        System.out.println(c1.hashCode());
        
	}
}
