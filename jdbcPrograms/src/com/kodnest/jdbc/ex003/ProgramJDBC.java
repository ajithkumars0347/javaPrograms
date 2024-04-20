package com.kodnest.jdbc.ex003;

import java.sql.*;
import java.util.Scanner;

public class ProgramJDBC {
	public static void showTable(Connection con) {
		String query="show tables";
        try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	public static void createTable(Connection con){
		System.out.println("enter the table name");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		String query="create table "+name+ "( id int, name varchar(20))";
		try {
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("table created successfully...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      
	}
	public static void reading(Connection con) {
		showTable(con);
		Scanner scanner=new Scanner(System.in);

		System.out.println("enter any one table");
		String name=scanner.nextLine();
		String query="select * from "+name;
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insert(Connection con){
		showTable(con);
		System.out.println("enter the table to be inserted..");
		Scanner scanner=new Scanner(System.in);
		String tname=scanner.nextLine();
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println("enter name");
		String name=scanner.next();
		
     String query="insert into "+tname+" values(6,'venki')";
          try {
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("value inserted successfully...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void update(Connection con){
		System.out.println("enter table name");
		Scanner scanner=new Scanner(System.in);
		String tname=scanner.next();
		System.out.println("enter id to be updated");
		int id=scanner.nextInt();
		System.out.println("enter updated name");
		String name=scanner.next();
        String query="update "+tname+" set name= "+"'"+name+"'"+" where rollno="+id;
        try {
			Statement stmt=con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void delete(Connection con){
		System.out.println("enter table name ");
		Scanner scanner=new Scanner(System.in);
		String tname=scanner.next();
		System.out.println("enter rollno to be deleted..");
		int rollno=scanner.nextInt();
   String query="delete from "+tname+" where rollno="+rollno;
   try {
	Statement stmt=con.createStatement();
	stmt.execute(query);
	System.out.println("row is deleted successfully....");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
}
