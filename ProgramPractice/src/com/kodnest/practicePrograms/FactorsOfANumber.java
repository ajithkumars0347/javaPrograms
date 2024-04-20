package com.kodnest.practicePrograms;

import java.util.Scanner;

public class FactorsOfANumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number..");
	int num=scanner.nextInt();
	for(int i=1;i<=6;i++) {
		if(num%i==0) {
			System.out.print(i+" ");
		}
	}
}
}
