package com.bytecoder.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping("/demopage")
	public String loadMyFirstPage()
	{
		return "demo";
	}
	//7
	@RequestMapping("/showSingleData")
	public ModelAndView showData()
	{
		ModelAndView mv=new ModelAndView("test","msg","Hello Tanay");
		return mv;
	}

	//7
	@RequestMapping("/showObjectData")
	public ModelAndView showObjectData(Employee e)
	{
		//Employee e=new Employee(53,"Tanay","Indore");
		e.seteId(145);
		e.seteName("Rahul");
		e.seteCity("Pune");
		ModelAndView mv=new ModelAndView("test2","msg",e);
		return mv;
	}
	//7
	@RequestMapping("/showAllUser")
	public ModelAndView viewUsersData()
	{
		Employee e=new Employee(53,"Tanay","Indore");
		Employee e1=new Employee(58,"Vinay","UP");
		Employee e2=new Employee(9,"Anil","Satna");
		Employee e3=new Employee(23,"Praveen","Burhanpur");
		List<Employee> list=new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		ModelAndView mv=new ModelAndView("allusers","msg",list);
		return mv;
	}
	//7
	@RequestMapping("/multiple")
	public String returnDataWithMultipleAttribute(ModelMap mm)
	{  
		mm.addAttribute("msg1","Welcome to you");
		mm.addAttribute("msg2",".....Please Continue");
		return "file3";
	}

	//8 Aug
	@RequestMapping("/loginPage")
	public String loadLoginPage()
	{
		return "login";
	}
	
	//8 August  Code replaced by down
	/*@RequestMapping(value ="/checkLogin",method = RequestMethod.POST)
	public String performLogin(HttpServletRequest req,Employee user)
	{
		String eEmail=req.getParameter("eEmail");  //line1
		String ePass=req.getParameter("ePass");     //line2
		user.seteEmail(eEmail);                      //line3
		user.setePass(ePass);                 //line4
		System.out.println(eEmail+" "+ePass);
		return "home";
	}*/

	//8 August Code
/*	@RequestMapping(value ="/checkLogin",method = RequestMethod.POST)
	public String performLogin(@ModelAttribute("user") Employee user)  //all 4 line code is replaced by @ModelAttribute 
	{                                   //datamember name and input type field name must be same...if not data will not be set by model Attribute
		System.out.println(user.geteEmail()+" "+user.getePass());
		return "home";
	}  */
 
	@RequestMapping(value ="/checkLogin",method = RequestMethod.POST)
	public String performLogin(@RequestParam("eEmail") String email,@RequestParam("ePass") String pass) 
	{        
		System.out.println(email+" "+pass);
		return "home";
	}
}
