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
     ApplicationContext ac=new ClassPathXmlApplicationContext("com/bytecoder/core/map/applicationContextMap.xml");
     Company c=(Company)ac.getBean("cmp");
     System.out.println(c.getCid()+" "+c.getCname());
    Map<Integer,String> pname =c.getPname();
                          Set s=pname.entrySet();
                          
                        Iterator it=  s.iterator();
                        while(it.hasNext())
                		{
                			Map.Entry m= (Map.Entry)it.next();
                			System.out.println(m.getKey()+" "+m.getValue());
                		}
                          
	}
}
