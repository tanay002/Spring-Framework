package com.springmvc;

import javax.servlet.http.HttpServletRequest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
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
	public String doRegistration(HttpServletRequest req,UserDto dto)
	{ 


		String uname=req.getParameter("uname");
		String upwd=req.getParameter("upwd");
		String uemail=req.getParameter("uemail");
		String umobno=req.getParameter("umobno");
		dto.setUemail(uemail);
		dto.setUmobno(umobno);
		dto.setUname(uname);
		dto.setUpwd(upwd);
				    
		//System.out.println(uemail+" "+umobno);
		
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