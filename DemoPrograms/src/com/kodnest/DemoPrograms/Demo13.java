package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo13 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a number to find factorial of a number");
   Factorial factori = new Factorial();
   System.out.println(factori.factorial(scanner.nextInt()));
}
}
