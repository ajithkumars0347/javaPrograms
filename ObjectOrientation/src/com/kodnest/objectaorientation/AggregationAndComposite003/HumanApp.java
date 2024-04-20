package com.kodnest.objectaorientation.AggregationAndComposite003;

public class HumanApp {
public static void main(String[] args) {
	Student student=new Student();
	System.out.println(student.heart.color);
	System.out.println(student.heart.weight);
	System.out.println(student.brain.color);
	System.out.println(student.brain.weight);
	Book book=new Book("let us C","badrinath",1000);
	student.hasA(book);
	Car car=new Car("lamborgani","black",10000000);
	student.carHasA(car);
	System.out.println(car.engine.type);
}
}
