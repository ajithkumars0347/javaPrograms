package com.kodnest.practicePrograms;

import java.util.Scanner;

public class LeapYearCheck {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a year...");
	int year=scanner.nextInt();
	if(year%4==0) {
		if(year%100!=0 || year%400==0) {
			System.out.println("this is leap year...");
			return;
		}
	}
	System.out.println("this is not a leap year...");
}
}
