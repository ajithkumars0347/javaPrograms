package com.kodnest.objectaorientation.AggregationAndComposite003;

public class Car {
String brand;
String color;
int cost;
public Car(String brand, String color, int cost) {
	super();
	this.brand = brand;
	this.color = color;
	this.cost = cost;
}
Engine engine=new Engine("oil type");
}