package com.kodnest.objectorientation.PracticeInJavasOOPsConcept;

public class Employee {
private int id;
private String name;
private double salary;
private static int idGenerate;
public Employee(String name,double sal) {
	this.name=name;
	this.salary=sal;
	id=++idGenerate;
}

public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getSalary() {
	return salary;
}

}
