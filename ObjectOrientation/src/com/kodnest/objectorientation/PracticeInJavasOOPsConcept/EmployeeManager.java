package com.kodnest.objectorientation.PracticeInJavasOOPsConcept;

import java.util.Scanner;

public class EmployeeManager {
	Scanner scanner=new Scanner(System.in);
	
private Employee[] emp;
private int size;
private int capacity;

public EmployeeManager(int capacity) {
	this.capacity=capacity;
  emp=new Employee[capacity];
  size=0;
}
public void addEmployer(String nameRec,double salRec) {
	if(capacity>size) {
emp[size]=new Employee(nameRec,salRec);
System.out.println(emp[size].getName()+" id is "+emp[size].getId());
size++;
}}
public void displayEmployee(int id) {
	for(int i=0;i<size;i++) {
		if(id==emp[i].getId()) {
			System.out.println("emp details...");
			System.out.println("emp name:"+emp[i].getName());
			System.out.println("emp salary:"+emp[i].getSalary());
		}
		else {
			System.out.println("enter valid id...");
		}
	}
}
public void allEmployeeList() {
	for(int i=0;i<size;i++) {
			System.out.println("emp details...");
			System.out.println("emp name:"+emp[i].getName());
			System.out.println("emp salary:"+emp[i].getSalary());
		}
}
}
