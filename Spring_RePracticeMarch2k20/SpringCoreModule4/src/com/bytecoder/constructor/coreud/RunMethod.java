package com.bytecoder.constructor.coreud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod 
{
	public static void main(String[] args) 
	{
          ApplicationContext ac=new ClassPathXmlApplicationContext("com/bytecoder/constructor/coreud/applicationcontext.xml");
          Employee e=(Employee) ac.getBean("emp");
                     System.out.println(e.getEid()+" "+e.getEname());
                     System.out.println(e.getCname());
	}
}
