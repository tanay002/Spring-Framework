package com.bytecoder.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class RunProgram 
{
	public static void main(String[] args)
	{
      Resource rs=new ClassPathResource("applicationContext.xml");
          BeanFactory beanf=new XmlBeanFactory(rs);
         Company c=(Company) beanf.getBean("cmp");
         System.out.println(c.getCregno()+" "+c.getCname());
         
	}
}
