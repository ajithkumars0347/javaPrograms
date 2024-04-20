package com.kodnest.jdbc.ex001;

import java.sql.*;
import java.sql.DriverManager;

public class Program1 {
public static void main(String[] args) {
	try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Ajithmysql0347@";
		String query="create table student(rollNo int,name varchar(10))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded...");
		
		Connection con=DriverManager.getConnection(url,username,password);
	    System.out.println("connection is established at"+con);
	    
	    Statement stmt=con.createStatement();
	    stmt.execute(query);
	    System.out.println("query is executed...");
	    } catch (Exception e) {
		e.printStackTrace();
	}
}
}
