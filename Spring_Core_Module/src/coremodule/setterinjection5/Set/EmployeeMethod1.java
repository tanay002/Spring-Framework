package coremodule.setterinjection5.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMethod1 
{
	public static void main(String[] args)
	{
		Resource rs=new ClassPathResource("ApplicationContext5.xml");
		BeanFactory  bf= new XmlBeanFactory(rs);

		Employee e=(Employee)bf.getBean("emp");
		System.out.println(e);
		System.out.println(e.getEid()+" "+e.getEname());
		e.displayInfo();

	}
}
