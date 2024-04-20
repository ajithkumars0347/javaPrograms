package com.kodnest.hibernateprog001;

public class Student {
int rollNo;
String name;
int age;
public Student(int rollNo,String name, int age) {
	this.rollNo=rollNo;
	this.name=name;
	this.age=age;
}
public int getRollNo() {
	return rollNo;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
}
