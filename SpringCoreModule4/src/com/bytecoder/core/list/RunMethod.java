package com.bytecoder.core.list;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod 
{
public static void main(String[] args)
{
 ApplicationContext ac= new ClassPathXmlApplicationContext("com/bytecoder/core/list/applicationcontext.xml");	
  Employee e=(Employee)ac.getBean("emp");
  System.out.println(e.getEmpid()+" "+e.getEmpname());
  System.out.println("MobileNo:- ");
   List<Long> mobno=e.getMobno();
                 Iterator it=mobno.iterator();
                 
                 while(it.hasNext())
                 {
                	 System.out.println(it.next());
                 }

}

}
