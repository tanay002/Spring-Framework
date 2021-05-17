package com.bytecoder.constructor.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod 
{
	public static void main(String[] args) 
	{
           ApplicationContext ac=new ClassPathXmlApplicationContext("com/bytecoder/constructor/core/applicationcontext.xml");
          Employee e=(Employee) ac.getBean("emp");
          System.out.println(e.getEid()+" "+e.getEname());

          Employee e1=(Employee) ac.getBean("emp1");
          System.out.println(e1.getEid()+" "+e1.getEname());
          
          Employee e2=(Employee) ac.getBean("emp2");
          System.out.println(e2.getEid()+" "+e2.getEname());
	}
}
