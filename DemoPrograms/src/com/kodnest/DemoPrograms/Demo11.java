package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo11 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a number to check whether givenn number is factor of 10 or not");
   FactorCheck check= new FactorCheck();
   boolean res=check.fact(scanner.nextInt());
   if(res==true) {
	   System.out.println("given number is factor of 10");
   }
   else {
	   System.out.println("given number is not factor of 10");
   }
	
}
}
