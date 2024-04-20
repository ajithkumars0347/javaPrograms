package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo12 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	FindingFactors findingFactors=new FindingFactors();
	System.out.println("enter a number");
	findingFactors.fact(scanner.nextInt());
}
}
