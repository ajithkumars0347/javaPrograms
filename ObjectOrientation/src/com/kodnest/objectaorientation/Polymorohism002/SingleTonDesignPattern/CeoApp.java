package com.kodnest.objectaorientation.Polymorohism002.SingleTonDesignPattern;

public class CeoApp {
public static void main(String[] args) {
	int c2=(int) Ceo.getInstance("rahul", 10000000);
	int c1=(int) Ceo.getInstance("ranjith", 20000000);
	System.out.println(c1);
	System.out.println(c2);
}
}
