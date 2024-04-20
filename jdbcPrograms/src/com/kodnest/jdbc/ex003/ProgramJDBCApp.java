package com.kodnest.jdbc.ex003;

import java.sql.*;
import java.util.Scanner;

public class ProgramJDBCApp {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Ajithmysql0347@";
		Connection con=null;
		Scanner scan=new Scanner(System.in);
		try {
			
		System.out.println("enter 1 for show table, 2 for create table, 3 for reading data,4 for insert, 5 for update,6 for delete");
		int num=scan.nextInt();
	    con=DriverManager.getConnection(url,username,password);
	    switch(num) {
	    case 1:ProgramJDBC.showTable(con);
	    break;
	    case 2:ProgramJDBC.createTable(con);
	    break;
	    case 3:ProgramJDBC.reading(con);
	    break;
	    case 4:ProgramJDBC.insert(con);
	    break;
	    case 5:ProgramJDBC.update(con);
	    break;
	    case 6:ProgramJDBC.delete(con);
	    break;
	    default:
	    	System.out.println("incorrect enter...please enter correct one...");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
}

