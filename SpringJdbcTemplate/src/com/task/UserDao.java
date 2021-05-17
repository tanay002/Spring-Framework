package com.task;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao
{
	private JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e)
	{
		String query="insert into employee values('"+e.getEid()+"','"+e.getEname()+"')";
		return jdbcTemplate.update(query);

	}
	public int updateEmployee(Employee e){
		String query="update employee set name='"+e.getEsalary()+"',salary='"+e.getEcity()+"' where id='"+e.getEid()+"' ";
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Employee e){
		String query="delete from employee where id='"+e.getEid()+"' ";
		return jdbcTemplate.update(query);
	}


}
