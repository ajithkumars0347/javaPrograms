package com.kodnest.hibernateprog001;
import java.sql.*;
public class StudentApp {
public static void main(String[] args) {
	Student student1=new Student(11,"ajay",22);
    Student student2=new Student(12,"amit",23);
    Student student3=new Student(13,"ankit",24);
    
    	String url="jdbc:mysql://local:3306/jdbc_database";
    	String username="root";
    	String password="Ajithmysql0347@";
    	String query="insert into student values("+student1.getRollNo()+","+student1.getName()+","+student1.getAge()+"),("+student2.getRollNo()+","+student2.getName()+","+student2.getAge()+")("+student3.getRollNo()+","+student3.getName()+","+student3.getAge()+")";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("inserted successfully...:)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
