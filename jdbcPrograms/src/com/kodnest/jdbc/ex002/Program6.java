package com.kodnest.jdbc.ex002;

import java.util.Scanner;
import java.sql.*;

public class Program6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Ajithmysql0347@";
		Connection con=null;

		try {
			con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(false);
			System.out.println("enter your id");
			int id=scanner.nextInt();
			System.out.println("enter the receiver id");
			int id2=scanner.nextInt();
			System.out.println("enter how much you need to send");
			int amount=scanner.nextInt();

			String query1="update bank set salary=salary-? where accno=?"; 
			String query2="update bank set salary=salary+? where accno=?";  


			PreparedStatement pstmt=con.prepareStatement(query1);
			PreparedStatement pstmt2=con.prepareStatement(query2);
			pstmt.setInt(1,amount);
			pstmt.setInt(2, id);
			pstmt2.setInt(1,amount);
			pstmt2.setInt(2, id2);
			pstmt.executeUpdate();
			pstmt2.executeUpdate();
		    con.commit();
			System.out.println("transaction successfully completed...thank you:)");
		} catch (SQLException e) {
			try {
				con.rollback();
				System.out.println("changes get revert back");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}

