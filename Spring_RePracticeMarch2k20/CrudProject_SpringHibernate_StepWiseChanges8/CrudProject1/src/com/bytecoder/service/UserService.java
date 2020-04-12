package com.bytecoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytecoder.dao.UserDao;
import com.bytecoder.model.UserDto;


@Service
public class UserService 
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
}
