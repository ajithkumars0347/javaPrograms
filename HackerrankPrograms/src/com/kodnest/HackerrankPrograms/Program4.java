package com.kodnest.HackerrankPrograms;

import java.util.Scanner;

public class Program4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int num1=scan.nextInt();
	if(num1%2==0) {
		if(num1>=3 && num1<=5) {
			System.out.println("not weird");
		}
		else if(num1<=6 && num1==20) {
			System.out.println("Weird");
		}
		else {
			System.out.println("not weird");
		}
	}
	else {
		System.out.println("weird");
	}
	
}
}
