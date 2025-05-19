package com.springcore.springJdbc.Jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//<> This has type of Object we are going to work on
public class Rowmapperimpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Mapping the result set
		
		//we have to return an object of student
		
		Student std= new Student();
		
		//rs.getDataType(ColumnIndex)
		
		std.setId(rs.getInt(1));
		std.setName(rs.getString(2));
		std.setAddress(rs.getString(3));
		
		
		return std;
	}

	
	
}
