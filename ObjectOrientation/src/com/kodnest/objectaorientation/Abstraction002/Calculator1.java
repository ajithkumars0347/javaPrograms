package com.kodnest.objectaorientation.Abstraction002;

public class Calculator1 implements Calculator {
public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public void subtraction() {
	int a=10;
	int b=20;
	int c=a-b;
	System.out.println(c);
}
public void multi() {
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
}
public int div() {
	int a=10;
	int b=20;
	int c=a/b;
	return c;
}
}
