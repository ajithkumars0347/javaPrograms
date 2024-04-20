package com.kodnest.objectaorientation.Abstraction002;

import java.util.Scanner;

public class Calculator2 implements Calculator {
	Scanner scanner=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("enter 2 numbers...");
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void subtraction() {
		System.out.println("enter 2 numbers...");
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c=a-b;
		System.out.println(c);
	}

	@Override
	public void multi() {
		System.out.println("enter 2 numbers...");
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c=a*b;
		System.out.println(c);
	
	}

	@Override
	public int div() {
		System.out.println("enter 2 numbers...");
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c=a/b;
			return c;
	}

}
