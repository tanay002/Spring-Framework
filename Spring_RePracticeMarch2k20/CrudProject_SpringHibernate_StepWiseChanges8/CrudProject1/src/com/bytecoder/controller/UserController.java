package com.bytecoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	}

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
}
