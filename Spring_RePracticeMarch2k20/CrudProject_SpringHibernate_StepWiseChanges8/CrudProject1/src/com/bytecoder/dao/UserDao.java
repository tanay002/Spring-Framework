package com.bytecoder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bytecoder.model.UserDto;

@Repository
public class UserDao
{
	@Autowired
	HibernateTemplate template;
	public boolean insertUserData(UserDto dto)
	{
		template.setCheckWriteOperations(false);
		template.save(dto);
		return true;
	}
}
