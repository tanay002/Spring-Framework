package com.bytecoder.dao;

import java.util.List;

import com.bytecoder.model.NationalityDto;

public interface NationalityDao 
{
	public List<NationalityDto> displayNationality();
	  public int deleteAllSelectedNationality(String [] selectedRow);
}
