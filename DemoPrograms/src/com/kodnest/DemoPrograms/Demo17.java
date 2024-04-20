package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo17 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	AutomorphicApp automorphicApp=new  AutomorphicApp();
	System.out.println("enter the rangge to find AUTOMORPHIC NUMBERS");
	int num=scanner.nextInt();
	int num1=scanner.nextInt();
	System.out.println("AUTOMORPHIC NUMBERS ARE==>");
	for(int i=num;i<=num1;i++) {
	boolean res=automorphicApp.autoM(i);
	if(res==true) {
		System.out.print(i+" ");
	}
}
}
}