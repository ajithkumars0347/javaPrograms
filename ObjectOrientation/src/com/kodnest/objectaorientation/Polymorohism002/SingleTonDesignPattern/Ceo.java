package com.kodnest.objectaorientation.Polymorohism002.SingleTonDesignPattern;

public class Ceo {
	static Ceo c=null;
	static int countObj=0;
	String name;
	int salary;
private Ceo(String name,int salary) {
	this.name=name;
	this.salary=salary;
}
public static void welcome() {
	System.out.println("welcome to CEO app:)");
}
public void hiring() {
	System.out.println(name+" CEO is hiring...");
}
public void maintain() {
	System.out.println(name+" CEO is maintain everything...");
}
public static int getInstance(String nam,int sal) {
	 {
	 c=new Ceo(nam,sal);
	 countObj++;
	 c.welcome();
	 c.hiring();
	 c.maintain();
}
	return countObj;
}
}
