package com.bytecoder.service;

import java.util.List;

import com.bytecoder.model.NationalityDto;

public interface NationalityService 
{
        public List<NationalityDto> displayNationality();
        public void deleteSelectedNationality(String [] selectedRow);
}
