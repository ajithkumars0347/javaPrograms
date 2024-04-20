package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the range to check how many prime numbers are there");
     PrimeNumCheck primeNumCheck = new PrimeNumCheck();
     int s1=scanner.nextInt();
     int s2=scanner.nextInt();
     int count=0;
     for(int i=s1;i<=s2;i++) {
    	 if(primeNumCheck.primeCheck(i)==true) {
    		 System.out.print(i+" ");
    		 count++;
    	 }
    	 }
     System.out.println();
     System.out.println("total number of prime numbers are "+count);
	}
}
