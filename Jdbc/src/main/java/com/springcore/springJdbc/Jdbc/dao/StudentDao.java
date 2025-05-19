package com.springcore.springJdbc.Jdbc.dao;

import java.util.List;

public interface StudentDao {
	
	public int insert(Student student) ;    //to insert query
	public int change(Student student);    //to update query
	public int delete(int student);  //to delete query
	
	//this will accept student id as parameter  and select the data of the same
	public Student getStudent(int studentId);    
	
	//to select multiple objects we use List collection type
	
	public List<Student> getAllStudent(); //there are no parameter because we need to select all the data
}
