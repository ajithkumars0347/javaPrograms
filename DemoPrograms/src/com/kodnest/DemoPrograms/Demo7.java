package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	ReverseANumber reverseANumber=new ReverseANumber();
	int num=scan.nextInt();
	System.out.println("entered number is "+num);
	int res=reverseANumber.reverse(num);
	System.out.println("reversed number is "+res);
	if(res==num) {
	System.out.println("given number is palindrome");
	}
	else {
		System.out.println("given number is not palindrome");
	}
}
}
