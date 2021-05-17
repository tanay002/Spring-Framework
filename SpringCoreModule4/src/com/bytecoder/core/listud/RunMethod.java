package com.bytecoder.core.listud;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod 
{
public static void main(String[] args)
{
 ApplicationContext ac= new ClassPathXmlApplicationContext("com/bytecoder/core/listud/applicationcontext.xml");	
  Employee e=(Employee)ac.getBean("emp");
  System.out.println(e.getEid()+" "+e.getEname());
  System.out.println("Personal Email:- ");
   List<PersonalMail> pemail=e.getPmail();
                 Iterator it=pemail.iterator();
                 
                 while(it.hasNext())
                 {
                	 System.out.println(it.next());
                 }

}

}
