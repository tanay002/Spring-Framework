package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
