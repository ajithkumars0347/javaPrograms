package com.kodnest.practice005;

public class Student {
String name;
int id;
public void study() {
	System.out.println("rollno"+id+" "+name+" is studying...");
}
public Student(String name,int id) {
	this.name=name;
	this.id=id;
}
}
