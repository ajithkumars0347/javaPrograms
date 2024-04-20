package com.kodnest.practice002;

import java.util.Scanner;

public class ArrayOfEmployee {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter how many Employees are working here..");
  Employee[] emp=new Employee[scanner.nextInt()];
  for(int i=0;i<=emp.length-1;i++) {
	  emp[i]=new Employee();
  }
 
  for(int i=0;i<=emp.length-1;i++) {
	  scanner.nextLine();
	  System.out.println("enter name and age of no "+i+" employee..");
     emp[i].name=scanner.nextLine();
     emp[i].age=scanner.nextInt();
  }
  System.out.println("employees details..");
  for(int i=0;i<=emp.length-1;i++) {
	  System.out.println((i+1)+" employee name is "+emp[i].name);
	  System.out.println((i+1)+" employee age is "+emp[i].age);
	  System.out.println(".......................................");
  }
}
}
