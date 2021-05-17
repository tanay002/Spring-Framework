package coremodule.setterinjection3.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Student_Main 
{
public static void main(String[] args) 
{
Resource rs=new ClassPathResource("ApplicationContext3.xml");	
BeanFactory bf=new XmlBeanFactory(rs);
Student s=(Student)bf.getBean("stud");
System.out.println(s.getSid()+" "+s.getSname());
s.displayInfo();
}
}
