package com.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public ModelAndView doregister(@ModelAttribute("user") UserDto user)
{
	AnnotationConfiguration cf=new AnnotationConfiguration().configure("hibernate.cfg.xml");
	SessionFactory factory = cf.buildSessionFactory();
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();   
        session.save(user);  
        t.commit();  
        System.out.println("successfully saved");    
        factory.close();  
        ModelAndView mv=new ModelAndView("practice","msg","you have successfully registered");
        return mv;
}
}