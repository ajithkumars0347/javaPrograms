package com.kodnest.objectaorientation.AggregationAndComposite002;

public class Student {
	int bWeight;
	String bCondition;
	public Student(int bweight,String bCondition) {
	this.bWeight=bweight;
	this.bCondition=bCondition;
	}
Brain brain=new Brain(3,"good");
Book bref;
public void hasA(Book bref) {
 this.bref=bref;
 System.out.println(bref.getId());
 System.out.println(bref.getName());
}
}
