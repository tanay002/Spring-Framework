package com.bytecoder.core.mapud;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMethod
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/bytecoder/core/mapud/applicationcontext.xml");
		Quiz que=(Quiz)ac.getBean("qz");
		System.out.println("Quiz code: "+que.getQid()+"\t\tQuiz Topic:"+que.getQtopic());

		Map<Questions, Answers> no=que.getNo();
		Set que_ans=no.entrySet();
		Iterator it=que_ans.iterator();
		System.out.println("");
		while(it.hasNext())
		{
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println("Question "+mp.getKey());
			System.out.println("Answer "+mp.getValue());
			System.out.println("");

		}

	}
}
