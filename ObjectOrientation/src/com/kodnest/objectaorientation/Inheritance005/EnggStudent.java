package com.kodnest.objectaorientation.Inheritance005;

public class EnggStudent extends Student {
int mark;
int sem;
public EnggStudent() {
	
}
public EnggStudent(String name,int age) {
	super("ajith",23);
	
}
public EnggStudent(String name){
	this.name=name;
	age=23;
}
}
