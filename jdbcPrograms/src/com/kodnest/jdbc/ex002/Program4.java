package com.kodnest.jdbc.ex002;
import java.sql.*;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Ajithmysql0347@";
		String query=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		int id=0;
		String name=null;
		int salary=0;
		Scanner scan=new Scanner(System.in);;
		try {
			con=DriverManager.getConnection(url,username,password);
			System.out.println("connection is established");
			query="insert into employee values(?,?,?)";
			pstmt=con.prepareStatement(query);
			System.out.println("enter number of rows...");
			int rows=scan.nextInt();
			for(int i=0;i<rows;i++) {
				System.out.println("enter id");
				id=scan.nextInt();
				System.out.println("enter name");
				name=scan.next();
				System.out.println("enter salary");
				salary=scan.nextInt();
				pstmt.setInt(1,id);
				pstmt.setString(2, name);
				pstmt.setInt(3, salary);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("rows are inserted...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				scan.close();
				con.close();
				pstmt.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
