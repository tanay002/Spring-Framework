package com.bytecoder.core.setud;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod 
{
	public static void main(String[] args)
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/bytecoder/core/setud/applicationcontext.xml");	
		Company e=(Company)ac.getBean("cmp");
		System.out.println("Company Code       Company Name");
		System.out.println(e.getCid()+"\t\t "+e.getCname());
		System.out.println("");
		System.out.println("Employee Working in Company Details:- ");
		Set<Employees> edetails=e.getEdetails();
		Iterator it=edetails.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
