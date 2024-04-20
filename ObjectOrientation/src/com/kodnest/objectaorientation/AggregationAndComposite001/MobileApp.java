package com.kodnest.objectaorientation.AggregationAndComposite001;

public class MobileApp {
public static void main(String[] args) {
	Mobile mobile=new Mobile();
	System.out.println(mobile.os.name);
	System.out.println(mobile.os.type);
	Charger charger=new Charger("samsung","C-type");
	mobile.hasA(charger);
}
}
