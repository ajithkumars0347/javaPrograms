package com.kodnest.jdbc.ex002;

import java.util.Scanner;
import java.sql.*;
public class Program3 {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Ajithmysql0347@";
		//loaded the driver...

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded...");
		//establishing the connection...
		Connection con=DriverManager.getConnection(url,username,password);

		while(true) {
			System.out.println("press 0 to exit,1 to insert, 2 to update, 3 to delete, 4 to select");
		Scanner scan=new Scanner(System.in);
		int ch=scan.nextInt();
		int id;
		int salary;
		if(ch==0) {
			return ;
		}
		switch(ch) {
		case 1:
			System.out.println("enter the number of rows...");
			int rows=scan.nextInt();
			for(int i=0;i<rows;i++) {
			System.out.println("enter id ");
			id=scan.nextInt();
			scan.nextLine();
			System.out.println("enter name");
			String name=scan.nextLine();
			System.out.println("enter salary");
			salary=scan.nextInt();
			insert(id,name,salary,con);
			}
			break;
		case 2:
			System.out.println("enter id to update");
			id=scan.nextInt();
			System.out.println("enter updated salary to update...");
			salary=scan.nextInt();
			update(salary,id,con);
		break;
		case 3:
			System.out.println("enter id to delete...");
			id=scan.nextInt();
			delete(id,con);
		break;
		case 4:
			select(con);
		break;
		default:
			System.out.println("please,enter valid number...");
		}}}
	public static void insert(int id,String name,int salary,Connection con)throws Exception {
		String query="insert into employee value(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setInt(3, salary);
		//excute the query statements...
		pstmt.executeUpdate();
		System.out.println("Row is ...");
	}
	public static void update(int salary,int id,Connection con) throws Exception{
		String query="update employee set salary =? where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1,salary);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		System.out.println("updation is done");
	}
	public static void delete(int id,Connection con) throws Exception{
		String query="delete from employee where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1,id);
		pstmt.execute();
		//excute the query statements...
		//stmt.execute(query);
		System.out.println("deletion is done");
	}
	public static void select(Connection con)throws Exception {
        String query="select * from employee";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);

        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
	}
}
