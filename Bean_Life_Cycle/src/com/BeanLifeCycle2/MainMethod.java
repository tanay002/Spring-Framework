package com.BeanLifeCycle2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod 
{
	public static void main(String[] args)
	{
      ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext2.xml");
      Employee e=(Employee)ac.getBean("emp2");
	  System.out.println(e);
	  ac.close();
	}
}
