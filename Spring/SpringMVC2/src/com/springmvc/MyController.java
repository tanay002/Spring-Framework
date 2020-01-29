package com.springmvc;

import javax.servlet.http.HttpServletRequest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController 
{
	@RequestMapping("/login")
	public String loadLoginPage()
	{
		return "loginpage";
	}

	@RequestMapping("/registrationPage")
	public String loadRegistrationPage()
	{
		return "registration";
	}

	@RequestMapping(value="/registrationPage1",method=RequestMethod.POST)
	public String doRegistration(@ModelAttribute("users") UserDto dto)
	{ 

		    AnnotationConfiguration cf1=(AnnotationConfiguration) new AnnotationConfiguration().configure("hibernate.cfg.xml");
			SessionFactory sf = cf1.buildSessionFactory();
			Session ses= sf.openSession();   
			Transaction t1=ses.beginTransaction();
			ses.save(dto);
			t1.commit();
			ses.close();
			System.out.println("successfully saved");    

		return "loginpage";    
	}
	
}