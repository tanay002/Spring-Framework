package com.bytecoder.collectioncore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Employee
public class RunProgram1 
{
	public static void main(String[] args) 
	{
       ApplicationContext ap= new ClassPathXmlApplicationContext("applicationContextList5.xml");
        Employee emp= (Employee)ap.getBean("emp");
        System.out.println(emp.getEid()+" "+emp.getEname());
       List<Long> mob= emp.getMobno();
      for(Object o:mob)
      {
    	  System.out.println(o);
      }
	}
}
