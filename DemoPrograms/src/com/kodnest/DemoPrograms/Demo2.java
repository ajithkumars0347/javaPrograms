package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 nos");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("before Swapping ="+a+" and "+b);
    int help=a;
    a=b;
    b=help;
    System.out.println("after Swapping ="+a+" and "+b);
}
}
