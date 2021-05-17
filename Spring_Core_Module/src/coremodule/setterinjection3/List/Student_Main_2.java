package coremodule.setterinjection3.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Main_2 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext3.xml");	
		Student s=(Student)ac.getBean("stud");
		System.out.println(s);  //toString
		System.out.println(s.getSid()+" "+s.getSname());  
		s.displayInfo();
	}
}
