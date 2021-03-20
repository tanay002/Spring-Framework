package com.bytecoder.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bytecoder.model.UserDto;

@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	HibernateTemplate template;
	public boolean insertUserData(UserDto dto)
	{
		template.setCheckWriteOperations(false);
		template.save(dto);
		return true;
	}
	
	
	public UserDto checkUserDetails(String email, String pass)
	{
		List userDetails=template.find("from UserDto where uEmail='"+email+"' and uPassword='"+pass+"'");
		if(userDetails.isEmpty())
		{
			return null;
		}
		else
		{
			return (UserDto)userDetails.get(0);
		}
	}
}
