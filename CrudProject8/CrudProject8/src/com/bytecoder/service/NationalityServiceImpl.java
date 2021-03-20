package com.bytecoder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytecoder.dao.NationalityDao;
import com.bytecoder.model.NationalityDto;

@Service
public class NationalityServiceImpl implements NationalityService
{
	@Autowired
	NationalityDao nationalityDao;
	
	public List<NationalityDto> displayNationality()
	{  
		List<NationalityDto> list=nationalityDao.displayNationality();
		return list;
	}


	public void deleteSelectedNationality(String[] selectedRow) 
	{
		int row=nationalityDao.deleteAllSelectedNationality(selectedRow);	
	}
}
