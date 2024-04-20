package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the length");
	Fibonacci fibonacci=new Fibonacci();
	fibonacci.fibonacci(scanner.nextInt());
}
}
