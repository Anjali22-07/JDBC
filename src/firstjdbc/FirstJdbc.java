/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstjdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Anjali Singh
 */
public class FirstJdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /* try{
            //load the driver
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            
            //create a connection
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Anjali");
            //create a Query
            
           // String a= "create table td(tId int(10) primary key auto_increment, tname varchar(50) not null, tcity varchar(40))";
            //inserting the values into table
            
            String q="insert into images(pic) values(?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            
            JFileChooser jif=new JFileChooser();
            jif.showOpenDialog(null);
           File file= jif.getSelectedFile();
            
            FileInputStream fis=new FileInputStream(file);
            
            
            //get the preparedStatement object
       
            
            
            pstmt.setBinaryStream(1,fis,fis.available());
            
           BufferedReader rd=new BufferedReader(new InputStreamReader (System.in));
            System.out.println("enter your name");
            String name=rd.readLine();
            System.out.println("enter your city");
            String city=rd.readLine();
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            
            pstmt.executeUpdate();
            System.out.println("database is updated");
            
          /*  Statement stmt=con.createStatement();
            stmt.executeUpdate(a);
            System.out.println("table is created");
            con.close();
            
        }
        catch(Exception e){
            System.out.println("there is some error");      
            
            
        }*/
        // TODO code application logic here
        
     
         try{
                //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //creating the connection
            String Url="jdbc:mysql://localhost:3306/register";
            String username="root";
            String password="Anjali";
                    
            Connection con= DriverManager.getConnection(Url,username,password);
            
            String a= "create table user1(id int primary key auto_increment,name varchar(59) not null,password varchar(60), email varchar(70)";
            
            String q="insert into user(Name,password,email) values(?,?,?)";
            
           PreparedStatement pstmt= con.prepareStatement(q);
           pstmt.setString(1,"nname");
           pstmt.setString(2,"paswrd");
           pstmt.setString(3,"e_mail");
           
           pstmt.executeUpdate();
            
           System.out.println("database is created");
            
            
            }
            catch(Exception e){
                e.printStackTrace();
               System.out.println("<h1>Error!!</h1>");
            }
    }
        
    }
    

