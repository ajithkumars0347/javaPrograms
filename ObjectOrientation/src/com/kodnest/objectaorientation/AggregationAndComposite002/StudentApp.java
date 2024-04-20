package com.kodnest.objectaorientation.AggregationAndComposite002;

public class StudentApp {
public static void main(String[] args) {
	Student student=new Student(3,"good");
	System.out.println(student.brain.bWeight);
	System.out.println(student.brain.bCondition);
	Book book=new Book("5 skills",01);
	student.hasA(book);
	student=null;
	System.out.println("student destroyed...");
	//System.out.println(student.brain.bWeight);
	//System.out.println(student.brain.bCondition);
    System.out.println(book.id);
    System.out.println(book.name);
}
}
