package com.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{

	@RequestMapping("/login")
	public String loadLoginPage()
	{
		return "loginpage";
	}

	@RequestMapping("/doReg")
	public String loadRegistrationPage()
	{
		return "registration";
	}

	@RequestMapping(value="/doReg",method=RequestMethod.POST)
	public ModelAndView doregister()
	{  
		UserDto dto=new UserDto("Tanny","helloworld","tanay1cool@gmail.com","8834656765");
		UserDto dto1=new UserDto("Tanay","hello","tanaycool2@gmail.com","8878034225");
		UserDto dto2=new UserDto("Tanay","helljava","tanay3cool@gmail.com","8845246765");
		UserDto dto3=new UserDto("Tanay","hey","tanaycool4@gmail.com","8878053455");
           List al=new ArrayList();
           al.add(dto);
           al.add(dto1);
           al.add(dto2);
           al.add(dto3);
		AnnotationConfiguration cf=new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		/*
		 * session.save(dto); session.save(dto1);
		 */
		t.commit();  
		System.out.println("successfully saved");    
		factory.close();  
		ModelAndView mv=new ModelAndView("practice","data",al);
		return mv;
	}
}