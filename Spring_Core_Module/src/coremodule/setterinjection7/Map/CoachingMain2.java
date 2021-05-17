package coremodule.setterinjection7.Map;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachingMain2 
{
	public static void main(String[] args) 
	{
       ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext7.xml");
            Coaching coa=(Coaching) ac.getBean("coach");
            System.out.println(coa);
    		System.out.println(coa.getCid()+" "+coa.getCname());
    		coa.displayInfo();
	}
}
