package com.bytecoder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bytecoder.model.NationalityDto;
import com.bytecoder.service.NationalityService;

@Controller
public class NationalityController 
{
	@Autowired NationalityService nationalityService;
	
	
     @RequestMapping("/viewNationality")
	public String viewNationality(@ModelAttribute("nationality") NationalityDto nationalityDto,ModelMap map)
	{
          List<NationalityDto> nationality=nationalityService.displayNationality();           	 
          map.addAttribute("viewNationality",nationality);
		return "viewNationality";
	}
    
     
     @RequestMapping(name="/deleteNationality",method = RequestMethod.POST)
 	public String deleteNationality(HttpServletRequest req,ModelMap map)
 	{
    	 String nId[]=req.getParameterValues("chkSelectRow");
    	 
    	         nationalityService.deleteSelectedNationality(nId);
           List<NationalityDto> nationality=nationalityService.displayNationality();           	 
           map.addAttribute("viewNationality",nationality);
 		return "viewNationality";
 	}
     
}
