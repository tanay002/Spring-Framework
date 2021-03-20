package com.bytecoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytecoder.dao.UserDao;
import com.bytecoder.model.UserDto;


@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao dao;
 
	public boolean doRegister(UserDto dto)
	{
		 boolean status=dao.insertUserData(dto);
		 if(status)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
	
	public UserDto checkUserAndLogin(String email, String pass)
	{
		UserDto user=dao.checkUserDetails(email,pass);
		
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
		
	}
}
