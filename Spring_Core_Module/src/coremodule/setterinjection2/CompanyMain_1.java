package coremodule.setterinjection2;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class CompanyMain_1 
{
	public static void main(String[] args) 
	{
     Resource rs= new ClassPathResource("ApplicationContext2.xml");
     BeanFactory bf=new XmlBeanFactory(rs);
     Company1 c=(Company1) bf.getBean("comp");
     System.out.println(c);
     
     
	}
}
