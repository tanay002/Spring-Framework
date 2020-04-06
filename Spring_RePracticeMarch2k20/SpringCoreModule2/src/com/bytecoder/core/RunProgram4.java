package com.bytecoder.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunProgram4
{
	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext2.xml");
       //Use of Bean Scope=Singleton  //Single object is created.....
		   System.out.println("Singleton");
		Company c=(Company) ap.getBean("cmp");
		Company c1=(Company) ap.getBean("cmp");
		Company c2=(Company) ap.getBean("cmp");
        System.out.println(c.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println("");
        //Use of Bean Scope=Prototype //
       System.out.println("Prototype");
    	Company c3=(Company) ap.getBean("cmp1");
		Company c4=(Company) ap.getBean("cmp1");
		Company c5=(Company) ap.getBean("cmp1");       //3 object is created
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());
        
	}
}
