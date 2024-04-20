package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo6 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	SumOfDigitApp sumOfDigitApp= new SumOfDigitApp();
	System.out.println("sum of digits is "+sumOfDigitApp.sumDigit(scan.nextInt()));
	
}
}
