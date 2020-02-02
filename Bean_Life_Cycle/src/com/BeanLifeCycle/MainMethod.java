package com.BeanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod 
{
	public static void main(String[] args)
	{
      ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext1.xml");
      Employee e=(Employee)ac.getBean("emp");
	  System.out.println(e);
	  ac.close();
	}
}
