package com.bytecoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
	
	@RequestMapping("/loginp")
	public String returnLoginPage()
	{
		return "loginPage";
		//throw new NullPointerException("Something goes wrong...! Contact with Admin....or TryAgain");
	}
	
	@RequestMapping("/reg")
	public String returnRegistrationPage()
	{
		return "registrationPage";
	}
	
}
