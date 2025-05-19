package com.springcore.springJdbc.Jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component("StdDao")
public class StudentDaoImplement  implements StudentDao{

	
	@Autowired  //to inject dependencies automatically
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student(id, name, address) values(?,?,?)";
		int r=this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getAddress());
        
        
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	// we can also use it on property ----  @Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	//to update data in database
	
	public int change(Student student) {
		//updating Data
		
		
		String query ="update student set name=?, address=? where id=?";
		
		int u=this.jdbcTemplate.update(query, student.getName(), student.getAddress(), student.getId());
		
		return u;
	}

	@Override
	public int delete(int student) {
		// delete operation

      String query ="delete from student where id=?";
      
      //to delete we provide the parameter passed to the method
     int d=this.jdbcTemplate.update(query, student);
		
		return d;
	}

	@Override
	public Student getStudent(int studentId) {
		// selecting single object from database
		
		String query="select * from student where id=?";
		
		//a parent class variable can store the child class object
		RowMapper<Student> rowMapper=new Rowmapperimpl();
		Student stds=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		return stds ;
	}

	
	public List<Student> getAllStudent() {
		// selecting Multiple students from database
		
		String query ="select * from student";
		RowMapper<Student> rowMapper=new Rowmapperimpl();
		List<Student> stds= this.jdbcTemplate.query(query,rowMapper);
		
		return stds;
	}
         
	
	
}
