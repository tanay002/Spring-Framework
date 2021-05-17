package coremodule.setterinjection;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain1
{
public static void main(String[] args) 
{
	
Resource rs=new ClassPathResource("ApplicationContext1.xml");	
BeanFactory b =new XmlBeanFactory(rs);
Employee1 e=(Employee1)b.getBean("emp");
System.out.println(e);

}
}
