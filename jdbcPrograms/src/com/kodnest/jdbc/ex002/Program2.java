package com.kodnest.jdbc.ex002;
import java.sql.*;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;
public class Program2 {
public static void main(String[] args) {
	try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Ajithmysql0347@";
		String query="select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded...");
		//establishing connection
		Connection con=DriverManager.getConnection(url, username, password);
	    System.out.println("connection is established...");
		Statement stmt=con.createStatement();
	   ResultSet rs =stmt.executeQuery(query);
	   while(rs.next()) {
		   System.out.println(rs.getInt(1)+" "+rs.getString(2));
	   }
	   System.out.println("Query is executed...");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
