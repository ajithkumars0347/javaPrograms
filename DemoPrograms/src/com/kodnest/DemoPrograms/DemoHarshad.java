package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class DemoHarshad {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	HarshadApp harshadApp = new HarshadApp();
	System.out.println("enter  a number ");
	boolean res=harshadApp.harsh(scanner.nextInt());
    if(res==true)
    	System.out.println("this number is harshad number");
    else
    	System.out.println("this number is not harshad number");
}
}
