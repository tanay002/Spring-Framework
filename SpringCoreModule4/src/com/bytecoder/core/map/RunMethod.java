package com.bytecoder.core.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod 
{
	public static void main(String[] args)
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/bytecoder/core/map/applicationcontext.xml");	
		Company e=(Company)ac.getBean("cmp");
		System.out.println("Company Code       Company Name");
		System.out.println(e.getCid()+"\t\t "+e.getCname());
		System.out.println("");
		System.out.println("Product name:- ");
		Map<Integer,String> product=e.getCproduct();
		Set s= product.entrySet();
		Iterator it=s.iterator();
		System.out.println("ProductCode\tProduct Name");
		while(it.hasNext())
		{               Map.Entry mp=(Map.Entry) it.next();
		System.out.println(mp.getKey()+"\t\t"+mp.getValue());
		}

	}

}
