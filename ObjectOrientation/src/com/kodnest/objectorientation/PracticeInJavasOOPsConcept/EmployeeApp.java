package com.kodnest.objectorientation.PracticeInJavasOOPsConcept;

import java.util.Scanner;

public class EmployeeApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter capacity...");
	int capacity = scanner.nextInt();
    EmployeeManager employeeManager=new EmployeeManager(capacity);
    while(true) {
    System.out.println("enter 1 for add,enter 2 for display employee, enter 3 for display all list...");
    int in=scanner.nextInt();
    scanner.nextLine();
    if(in==1) {
    	System.out.println("enter name of the employee...");
    	String name=scanner.nextLine();
    	System.out.println("enter salary of the employee...");
    	double sal=scanner.nextDouble();
    	employeeManager.addEmployer(name,sal);
    	System.out.println("terminated..");
    }
    else if(in==2) {
    	System.out.println("enter employee id...");
        int id=scanner.nextInt();
    	employeeManager.displayEmployee(id);
    }
    else if(in==3) {
    	employeeManager.allEmployeeList();
    }
    else {
    	System.out.println("enter valid input...");
    }
}}
}
