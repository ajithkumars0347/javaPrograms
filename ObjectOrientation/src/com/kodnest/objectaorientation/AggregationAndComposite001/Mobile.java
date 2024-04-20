package com.kodnest.objectaorientation.AggregationAndComposite001;

public class Mobile{
OS os =new OS(32,"Android");
Charger cref;
public void hasA(Charger cref) {
	this.cref=cref;
	System.out.println(cref.getName());
	System.out.println(cref.getType());
}
}
