package com.bytecoder.core.set;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod1
{
	public static void main(String[] args)
	{
          ApplicationContext ac=new ClassPathXmlApplicationContext("com/bytecoder/core/setud/applicationContextSet1.xml");
          Employee e=(Employee)ac.getBean("emp");
          System.out.println(e.getEid()+" "+e.getEname());
          Set<Long> mobno=e.getMobno();
          
         for(Long l:mobno)
         {
        	 System.out.println(l);
         }
	}
}
