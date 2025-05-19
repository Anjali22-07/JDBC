package com.springcore.springJdbc.Jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.springJdbc.Jdbc.dao.StudentDao;
import com.springcore.springJdbc.Jdbc.dao.StudentDaoImplement;

@Configuration
//if we are using java configuration
@ComponentScan(basePackages = {"com.springcore.springJdbc.Jdbc.da"})
public class jdbcConfig {
	
	//3 methods will be created
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=False");
		ds.setUsername("root");
		ds.setPassword("Anjali");
		
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate temp=new  JdbcTemplate();
		temp.setDataSource(getDataSource());
		
		return temp;
		
	}

/*	@Bean("StdDao")
	public StudentDaoImplement stdsd() {
		 
		StudentDaoImplement std = new StudentDaoImplement();
		std.setJdbcTemplate(getTemplate());
		
		return std;
	}   */
	
	
}
