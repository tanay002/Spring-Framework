package com.bytecoder;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class RunProgram 
{
	public static void main(String[] args) 
	{
          ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
                       HibernateTemplate temp=(HibernateTemplate) ac.getBean("template");
                                 //ye read only mode me have...iska matlb we can't perform write operation  but we can perform "get" operation
                         //spring4 me transaction management compulsary hota hai..so we have to write 1 line code  
              
                                                        //In spring3 it will work without txmanagement
                      
                     temp.setCheckWriteOperations(false); 
                       UserDto dto=new UserDto();
                      // dto.setuId(2);
                       dto.setuName("chucha");
                       dto.setuCity("banglore");
                       temp.save(dto);     
                       
                       List ls=temp.find("from UserDto");
                      for(Object o:ls)
                      { 
                    	  UserDto dto1=(UserDto) o;
                    	  System.out.println(dto1.getuId()+" "+dto1.getuName()+" "+dto1.getuCity());
                      }
                       
                       System.out.println("done");
	}
}
