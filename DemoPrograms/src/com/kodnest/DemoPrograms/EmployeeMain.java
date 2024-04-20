package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Employee employee[]=new Employee[5];
	for(int i=0;i<=5-1;i++) {
		employee[i]=new Employee();
	}
	
	for(int i=0;i<=employee.length-1;i++) {
		System.out.println("enter "+i+" employee name and age");
		employee[i].name=scan.nextLine();
		employee[i].age=scan.nextInt();
		scan.nextLine();
	}
	System.out.println("all employee details");
	for(int i=0;i<=employee.length-1;i++) {
		System.out.println(employee[i].name);
		System.out.println(employee[i].age);
	}
}
}
