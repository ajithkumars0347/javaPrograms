package com.demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String []args) {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("enter a range to fine the prime numbers");
        int range=scan.nextInt();
        for(int i=3;i<=range;i++) {
        	boolean status=check(i);
       		if(status==true) {
       			System.out.print(i+" ");
       		}
       		
        }
   		
		
}
	public static boolean check(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}