package coremodule.setterinjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyMain_1_2
{
	public static void main(String[] args) 
	{
		
          ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext2.xml");
     Company1 c=(Company1) ac.getBean("comp");
     System.out.println(c);
     
     
	}
}
