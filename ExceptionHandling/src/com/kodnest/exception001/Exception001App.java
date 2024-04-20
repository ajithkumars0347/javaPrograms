package com.kodnest.exception001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception001App {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("connection established...");
	Runtime rt=Runtime.getRuntime();
	try {
	System.out.println("enter two numbers...");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=a/b;
	System.out.println("the divident result is "+c);
	System.out.println("enter size of the array...");
	int[] arr=new int[scanner.nextInt()];
	System.out.println("enter the position to add in the array...");
	 int pos=scanner.nextInt();
	 System.out.println("enter the element to add into the array...");
      arr[pos]=scanner.nextInt();
      System.out.println(arr[pos]+"is in the position of"+pos);
	}
	
	catch(ArithmeticException ari) {
		System.out.println("ArithmeticException happened...");
	}
	catch(InputMismatchException input) {
		System.out.println("InputMismatchException happened...");
	}
	catch(NegativeArraySizeException ne) {
		System.out.println("NegativeArraySizeException happened...");
	}
	catch(ArrayIndexOutOfBoundsException arr) {
		System.out.println("ArrayIndexOutOfBoundsException happened...");
	}
	catch(Exception e) {
		System.out.println("some error has ocured ...please try again...");
	}
	finally {
		scanner.close();
		System.out.println("finally connection terminated before end the execution...");
	}
	}
}
