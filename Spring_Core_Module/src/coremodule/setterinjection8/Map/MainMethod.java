package coremodule.setterinjection8.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Resource rs= new ClassPathResource("ApplicationContext8.xml");	
		BeanFactory bf=new XmlBeanFactory(rs);
		Trainer  t=(Trainer) bf.getBean("tra");
		System.out.println(t);
		System.out.println(t.getTid()+" "+t.getTname());
		t.displayInfo();

	}
}
