package coremodule.setterinjection6.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMethod1_2
{
	public static void main(String[] args) 
	{ 
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext6.xml");
		Internship i=(Internship)ac.getBean("intern");
		System.out.println(i);
		System.out.println(i.getCname()+" "+i.getCourse());
		i.displayInfo();
	}
}
