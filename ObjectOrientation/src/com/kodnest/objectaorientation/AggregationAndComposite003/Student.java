package com.kodnest.objectaorientation.AggregationAndComposite003;

public class Student extends Human {
	Book bref;
	public void hasA(Book bref) {
		this.bref=bref;
		System.out.println(bref.author);
		System.out.println(bref.name);
		System.out.println(bref.price);
}
	Car cref;
	public void carHasA(Car cref) {
		System.out.println(cref.brand);
		System.out.println(cref.color);
		System.out.println(cref.cost);
	}
	}
