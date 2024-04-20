package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int count=0;
	Armstrong armstrong=new Armstrong();
	System.out.println("enter the number till where it check");
	int n=scanner.nextInt();
	for(int i=1;i<=n;i++) {
	int res=armstrong.arms(i);

	if(res==i) {
		System.out.print(i+" ");
		count++;
	}
}
	System.out.println("the number of ArmStrong numbers are "+count);
}
}