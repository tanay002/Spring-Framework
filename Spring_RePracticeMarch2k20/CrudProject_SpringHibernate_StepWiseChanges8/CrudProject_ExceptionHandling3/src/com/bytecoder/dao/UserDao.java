package com.bytecoder.dao;

import com.bytecoder.model.UserDto;

public interface UserDao 
{
	public boolean insertUserData(UserDto dto);

	public UserDto checkUserDetails(String email, String pass);
}
