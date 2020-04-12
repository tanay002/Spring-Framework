package com.bytecoder.service;

import com.bytecoder.model.UserDto;

public interface UserService 
{
	public boolean doRegister(UserDto dto);

	public UserDto checkUserAndLogin(String email, String pass);
}
