package com.bytecoder.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GenericExceptionHandler 
{
    //@ExceptionHandler({NullPointerException.class,ClassCastException.class}) 
	  @ExceptionHandler(Exception.class)
	  public ModelAndView manageAllException(Exception exception)
	  { 
		  return new ModelAndView("errorPage","msg",exception.getMessage()); //"Kuch problem aa gayi hai bhai sahi karo"
	  }
    	
    	@ExceptionHandler(InvalidUser.class) 
  	  public ModelAndView returnGenericPage(InvalidUser exception)
  	  { 
  		  return new ModelAndView("genericPage","msg",exception.getMessage()); 
  	  }
}
