package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo15 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	StrongNum stro=new StrongNum();
	System.out.println("enter  the range to find STRONG numbers");
	int from=scanner.nextInt();
	int to=scanner.nextInt();
	for(int i=from;i<=to;i++) {
	boolean res=stro.strong(i);
	if(res==true)
		System.out.print(i+" ");
}
}
}