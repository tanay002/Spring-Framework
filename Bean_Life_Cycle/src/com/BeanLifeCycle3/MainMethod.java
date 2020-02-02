package com.BeanLifeCycle3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod 
{
	public static void main(String[] args)
	{
      ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext3.xml");
      Employee e=(Employee)ac.getBean("emp3");
	  System.out.println(e);
	  ac.close();
	}
}
