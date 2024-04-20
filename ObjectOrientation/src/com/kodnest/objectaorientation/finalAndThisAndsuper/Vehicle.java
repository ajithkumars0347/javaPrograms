package com.kodnest.objectaorientation.finalAndThisAndsuper;

public class Vehicle {
	String companyName="HONDA";
	public /*static->this will give error in child overridden methods*/ void move() {
		System.out.println("Vehicle is moving...");
	}
}
