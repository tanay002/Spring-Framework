package coremodule.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;*/
/*import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;*/

public class EmployeeMain1_2
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		Employee1 e=(Employee1)ac.getBean("emp");
		System.out.println(e);
	}
}
