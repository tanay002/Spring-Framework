package com.springmvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
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
	public ModelAndView doRegister(@ModelAttribute("user") UserDto user)
	{
		AnnotationConfiguration cf=new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		session.save(user);  
		t.commit();     
		factory.close();  
		ModelAndView mv=new ModelAndView("loginpage","msg","you have successfully registered");
		return mv;
	}

	@RequestMapping(value="/checklogin",method=RequestMethod.POST)
	public  ModelAndView authenticateLoginDetail(@ModelAttribute("user") UserDto dto,HttpSession ses)
	{
		String uemail=dto.getUemail();
		String upass=dto.getUpass();


		AnnotationConfiguration cf = new AnnotationConfiguration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cf.buildSessionFactory();
		Session session = sessionFactory.openSession();
		UserDto dto1 =(UserDto) session.get(UserDto.class,uemail);
		if(dto1!=null)
		{
			String fetchpass=dto1.getUpass();
			if(fetchpass.equals(upass))
			{   
				ses.setAttribute("dtoo",dto1);
				ModelAndView mv=new ModelAndView("home","msg",dto1);
				return mv;
			}
			else
			{
				ModelAndView mv=new ModelAndView("loginpage","msg","Invalid gmail or password");
				return mv;
			}

		}
		else
		{
			ModelAndView mv=new ModelAndView("loginpage","msg","Invalid gmail or password");
			return mv;
		}
	}

	@RequestMapping(value="/editdetails")
	public  ModelAndView doEditDetails(UserDto dto ,HttpSession ses)
	{ 
		if(ses!=null)
		{
			AnnotationConfiguration cf = new AnnotationConfiguration();
			cf.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = cf.buildSessionFactory();
			Session session = sessionFactory.openSession();
			UserDto ud= (UserDto) ses.getAttribute("dtoo");
			String email= ud.getUemail();
			UserDto dto1 =(UserDto) session.get(UserDto.class,email);
			ModelAndView mv=new ModelAndView("editdetails","msg",dto1);
			return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("loginpage","msg","Already Logout...!");
			return mv;
		}
	}

	@RequestMapping(value="/updatedetails",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateDetails(@ModelAttribute("user") UserDto dto,HttpSession ses)   
	{ 
		if(ses!=null)
		{
			AnnotationConfiguration cf=new AnnotationConfiguration().configure("hibernate.cfg.xml");
			SessionFactory factory = cf.buildSessionFactory();
			Session session = factory.openSession();  
			Transaction t = session.beginTransaction();   
			ses.getAttribute("dtoo");
			session.update(dto);
			t.commit();      
			factory.close();  
			ModelAndView mv=new ModelAndView("home","msg1","Successfully Updated");
			return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("loginpage","msg","Already Logout...!");
			return mv;
		}
	}

	@RequestMapping(value="/viewalluser")
	public ModelAndView viewAllDetails(UserDto dto, HttpSession ses)
	{ 
		if(ses!=null)
		{
			AnnotationConfiguration cf=new AnnotationConfiguration().configure("hibernate.cfg.xml");
			SessionFactory factory = cf.buildSessionFactory();
			Session session = factory.openSession();  
			Criteria criteria = session.createCriteria(UserDto.class);
			List<UserDto> list = criteria.list();
			ModelAndView mv=new ModelAndView("deleteusers","data",list); 
			return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("loginpage","msg","Already Logout...!");
			return mv;
		}

	}

	@RequestMapping(value="/deleteData",method=RequestMethod.POST)
	public String deleteData(@ModelAttribute("dto") UserDto dto,HttpSession ses,HttpServletRequest req) throws IOException
	{        
		if(ses!=null)
		{	
			AnnotationConfiguration cf=new
					AnnotationConfiguration().configure("hibernate.cfg.xml"); 
			SessionFactory factory = cf.buildSessionFactory();
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();            
			String[] a=req.getParameterValues("check");
			UserDto dtok=(UserDto) ses.getAttribute("dtoo");
			String emaill=dtok.getUemail();
			int i;
			for(i=0; i<a.length;i++)
			{  
				String qString="delete from UserDto ud where ud.uemail=?";
				Query query=session.createQuery(qString);
				query.setParameter(0, a[i]);
				query.executeUpdate(); 		 
			}
			t.commit();

			session.close();
			return "redirect:viewalluser.do";
		}
		else
		{
			return "loginpage";	
		}
	}
	@RequestMapping(value="/logout")
	public ModelAndView doLogout(HttpSession ses)
	{
		if(ses!=null)
		{
			ses.invalidate();
			ModelAndView mv=new ModelAndView("loginpage","msg","Logout Successfully...!");
			return mv;		
		}
		else
		{
			ModelAndView mv=new ModelAndView("loginpage","msg","Already Logout...!");
			return mv;	
		}
	}

	@RequestMapping("/changepass")
	public String loadPasswordPage()
	{
		return "changepassword";
	}

	@RequestMapping(value="/changep",method = RequestMethod.POST)
	public ModelAndView changePassword(HttpServletRequest req,HttpSession ses)
	{

		String currentpass=req.getParameter("upass");
		String newpass=req.getParameter("upass1");
		String confirmpass=req.getParameter("upass2");
		UserDto dto=(UserDto)ses.getAttribute("dtoo");
		//String upwd=dto.getUpass();
		String email=dto.getUemail();
		AnnotationConfiguration cf=new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session sesso=factory.openSession();
		Transaction t = sesso.beginTransaction();  
		if(newpass.equals(confirmpass))
		{
			UserDto dto1 =(UserDto) sesso.get(UserDto.class,email);
			String dbpass=dto1.getUpass();
			if(dbpass.equals(currentpass))
			{
               dto1.setUpass(newpass);
               sesso.update(dto1);
               t.commit();
               sesso.close();
               ModelAndView mv=new ModelAndView("home","msg","Password Change Successfully...!");
               return mv;
			}
			else
			{
				ModelAndView mv=new ModelAndView("changepassword","msg","Invalid Current Password....!");
	               return mv;
			}
		}
		else
		{
			ModelAndView mv=new ModelAndView("changepassword","msg","New Passwords Does not match..Try Again");
			return mv;
		}
	}
}