package coremodule.setterinjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyMain_1_2
{
	public static void main(String[] args) 
	{
		
          ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext2.xml");
     Company1 c=(Company1) ac.getBean("comp");
      CompanyAddress1 ca= c.getCadd();
     Company1 c1=(Company1) ac.getBean("comp");
     
     CompanyAddress1 ca1= c.getCadd();
    
     System.out.println(c.hashCode()+" "+c1.hashCode());
     
     System.out.println(c==c1);
    
     System.out.println(c);
     
     System.out.println(ca.hashCode()+" "+ca1.hashCode());
     System.out.println(ca==ca1);
     
     
	}
}
