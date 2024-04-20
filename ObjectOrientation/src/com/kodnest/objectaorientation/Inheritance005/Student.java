package com.kodnest.objectaorientation.Inheritance005;

public class Student {
String name;
int age;
public Student() {
	
}
public Student(String name) {
	this.name=name;
	age=21;
}
public Student(String name,int age) {
	this();
	this.name=name;
	this.age=age;
}
}
