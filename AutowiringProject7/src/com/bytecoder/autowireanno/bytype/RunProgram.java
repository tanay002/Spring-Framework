package com.bytecoder.autowireanno.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunProgram 
{
public static void main(String[] args) 
{
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/bytecoder/autowireanno/bytype/applicationContext.xml");
	Company cmp=(Company)ac.getBean("comp");
	System.out.println(cmp.getProduct() );
	
}
}
