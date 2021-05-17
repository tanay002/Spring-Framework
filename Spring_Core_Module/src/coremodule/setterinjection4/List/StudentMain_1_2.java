package coremodule.setterinjection4.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain_1_2
{
   
	public static void main(String[] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext4.xml");
                Student s=(Student)ac.getBean("stud");
                System.out.println(s);   
               System.out.println(s.getSid()+" "+s.getSname());
                s.displayInfo();
	}
}
