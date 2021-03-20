package com.bytecoder.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import com.bytecoder.exception.InvalidUser;
import com.bytecoder.model.UserDto;
import com.bytecoder.service.UserService;

@Controller
public class UserController
{
	@Autowired
	UserService userService;

	@RequestMapping("/loginp")
	public String returnLoginPage()
	{
		return "loginPage";
		//throw new NullPointerException("Something goes wrong...! Contact with Admin....or TryAgain");
	}
	
	/*
	  @ExceptionHandler({NullPointerException.class,ClassCastException.class}) 
	  public ModelAndView returnErrorPage(Exception exception)
	  { 
		  return new ModelAndView("errorPage","msg",exception.getMessage()); 
	  }
	*/
	

	@RequestMapping("/reg")
	public String returnRegistrationPage()
	{
		return "registrationPage";
	}


	@RequestMapping(value="/doReg",method = RequestMethod.POST)
	public ModelAndView doRegistration(@ModelAttribute("dto") UserDto dto)
	{
		boolean status=userService.doRegister(dto);
		if(status)
		{
			return new ModelAndView("loginPage","msg","Successfully Registered....Login Now!"); 
		}
		else
		{
			return new ModelAndView("registrationPage","msg","Something goes wrong....Try Again!"); 

		}
	}
	
	@InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   
     dateFormat.setLenient(false);
     webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("user") UserDto dto)
	{
		
		UserDto user=userService.checkUserAndLogin(dto.getuEmail(),dto.getuPassword());
		if(user!=null)
		{ 
			return new ModelAndView("homePage","msg","Successfully Login \n Welcome "+user.getfName()+" "+user.getlName()); 
		}
		else
		{
			//return new ModelAndView("loginPage","msg","Invalid Username or Password....Try Again!"); 
			throw new InvalidUser("Invalid Username or Password....Try Again!");

		}
		
	}
	
	
}
