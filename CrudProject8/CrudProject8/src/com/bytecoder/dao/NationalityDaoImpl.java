package com.bytecoder.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bytecoder.constant.IsConstant;
import com.bytecoder.model.NationalityDto;


@Repository
public class NationalityDaoImpl implements NationalityDao
{
	@Autowired
	HibernateTemplate template;
	public List<NationalityDto> displayNationality()
	{
		List list=template.find("from NationalityDto where IsDeleted='"+IsConstant.IS_DELETED+"' ORDER BY nName ASC");
		if(list!=null)
		{
			return (List<NationalityDto>) list;
		}
		else
			return null;
	}
	
	public int deleteAllSelectedNationality(String[] selectedRow) 
	{ 

		int updatedRow=template.execute(new HibernateCallback<Integer>()
		{
			int updatedRow=0;
			   public Integer doInHibernate(Session session) 
			   { 
				   String updateQuery="update NationalityDto set isDeleted=0 where nId=:N";
				   Query query=session.createQuery(updateQuery);

				   		for(int i=0;i<selectedRow.length;i++)
				   		{
				   			query.setParameter("N",Integer.parseInt(selectedRow[i]));
				   			query.executeUpdate();
				   			updatedRow++;
				   		}
				   return updatedRow;
			   }
		});
		return updatedRow;
	}
}