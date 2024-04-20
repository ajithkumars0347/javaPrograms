package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class DemoAbundant {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	AbundantNumber abundantNumber=new AbundantNumber();
	System.out.println("enter a number");
	abundantNumber.abun(scanner.nextInt());
}
}
