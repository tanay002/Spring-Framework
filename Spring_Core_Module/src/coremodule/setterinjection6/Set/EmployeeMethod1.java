package coremodule.setterinjection6.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMethod1 
{
	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("ApplicationContext6.xml");
		BeanFactory bf= new XmlBeanFactory(rs);
		Internship i=(Internship)bf.getBean("intern");
		System.out.println(i);
		System.out.println(i.getCname()+" "+i.getCourse());
		i.displayInfo();
	}
}
