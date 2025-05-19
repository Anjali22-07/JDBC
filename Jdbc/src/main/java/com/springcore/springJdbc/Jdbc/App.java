package com.springcore.springJdbc.Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springJdbc.Jdbc.dao.Student;
import com.springcore.springJdbc.Jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started!!" );
        
        //spring jdbc==> jdbcTemplate
        
       // ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springJdbc/Jdbc/jdbcCon.xml");
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
       /* //creating object of the bean
        JdbcTemplate bean= context.getBean("database", JdbcTemplate.class);
        
        //inserting the query
        
        String query="insert into student(id, name, address) values(?,?,?)";
        
        //fire the query---we are using the template directly without opening the connections
        
       int result = bean.update(query, 6,"Swaati Singh", "Kanpur");
        //456 is the id.. swati is the name,,,,kanpur is the address  */
       
       StudentDao studentDao = context.getBean("StdDao", StudentDao.class);
       // create object of the Student class
       
     /*   Student student= new Student();
        student.setId(789);
        student.setName("Rahul");
        student.setAddress("Indore");
        
        int result=studentDao.insert(student);
        System.out.println("Student added" +result);*/
        
        //to update values in database
       
     /*  Student std=new Student();
       std.setId(789);
       std.setName("Sneha");
       std.setAddress("Bangalore");
       
       int updt= studentDao.change(std);
       System.out.println("student Updated" +updt);*/
       
       //to delete query
       
      /* int result =studentDao.delete(789);
       int r =studentDao.delete(456);
       System.out.println("student Data deleted" +result);
       System.out.println("Student Data Deleted successfully");*/
       
    //to select single object   
    /*   Student std = studentDao.getStudent(6);
       System.out.println("Student Data Selected Successfully!!");
       System.out.println(std); */
       
        
       //to select multiple objects
       
     List<Student> students=studentDao.getAllStudent();
     //to traverse List
     for(Student s:students) {
    	 
    	 System.out.println(students);
     }
       
    }
}
