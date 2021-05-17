package coremodule.setterinjection7.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CoachingMain
{
	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("ApplicationContext7.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		Coaching c=(Coaching)bf.getBean("coach");
		System.out.println(c);
		System.out.println(c.getCid()+" "+c.getCname());
           c.displayInfo();
	}
}
