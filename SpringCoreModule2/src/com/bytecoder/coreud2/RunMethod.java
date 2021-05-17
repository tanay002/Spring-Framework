package com.bytecoder.coreud2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod
{
	public static void main(String[] args)
	{
        ApplicationContext ac=  new ClassPathXmlApplicationContext("applicationContextUd4.xml");
        Employee e=(Employee)ac.getBean("emp");
        System.out.println(e.getEid()+" "+e.getEname());
        System.out.println(e.getMobno());
        
        
        Employee e1=(Employee)ac.getBean("emp2");
        System.out.println(e1.getEid()+" "+e1.getEname());
        System.out.println(e1.getMobno());
	}
}
