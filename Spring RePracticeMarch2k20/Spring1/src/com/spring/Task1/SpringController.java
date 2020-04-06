package com.spring.Task1;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	@RequestMapping("/login")
	public String doLoadLoginPage()
	{
		return "loginpage";

	}
	
	@RequestMapping("/reg")
	public String doRegistrationPage()
	{
		return "registrationpage";

	}
	
	@RequestMapping("/registerc")
	public String doRegistrationController(@ModelAttribute("user") UserDto dto)
	{
	
		return "registrationpage";

	}
	
	/*
	@RequestMapping("/loginc")
	public String doLoginController(HttpServletRequest req,UserDto dto)
	{
		String email=req.getParameter("email");
		String upass=req.getParameter("upass");
		System.out.println(email+" "+upass);
       dto.setEmail(email);
       dto.setUpass(upass);
		return "welcome";
	}
	*/
	
	/*@RequestMapping("/loginc")
	public String doLoginController(@ModelAttribute("user") UserDto dto)
	{
		return "welcome";
	} */
	
/*4	@RequestMapping("/loginc")
	public String doLoginController(@ModelAttribute("user") UserDto dto,ModelMap mp)
	{ 
		String uname="tanay_002";
		mp.addAttribute("msg1","Welcome");
		mp.addAttribute("msg2",uname);
		return "welcome";
	}  */
	
/*5	@RequestMapping("/loginc")
	public String doLoginController(@ModelAttribute("user") UserDto dto,ModelMap mp)
	{ 
		mp.addAttribute("msg1",dto);
		return "welcome";
	}
*/
	
	@RequestMapping("/loginc")
	public String doLoginController(@ModelAttribute("user") UserDto dto,ModelMap mp)
	{ 
		UserDto dto1=new UserDto();
		dto1.setEmail("tanay.saxena002@gmail.com");
		UserDto dto2=new UserDto();
		dto2.setEmail("tanay.saxena003@gmail.com");
		UserDto dto3=new UserDto();
		dto3.setEmail("tanay.saxena0044@gmail.com");
		List<UserDto> ls=new ArrayList<UserDto>();
		ls.add(dto1);
		ls.add(dto2);
		ls.add(dto3);
		mp.addAttribute("list",ls);
		return "welcome";
	}
}
