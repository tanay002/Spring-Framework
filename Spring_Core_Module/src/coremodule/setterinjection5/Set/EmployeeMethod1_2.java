package coremodule.setterinjection5.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMethod1_2
{
	public static void main(String[] args)
	{
		ApplicationContext	ac=new ClassPathXmlApplicationContext("ApplicationContext5.xml");
		Employee e=(Employee)ac.getBean("emp");
		System.out.println(e);
	System.out.println(e.getEid()+" "+e.getEname());
	 e.displayInfo();
	}
}
