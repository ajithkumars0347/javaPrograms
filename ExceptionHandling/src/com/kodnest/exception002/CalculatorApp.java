package com.kodnest.exception002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorApp {
public static void main(String[] args) {
	System.out.println("Calculator is started...");
	Scanner scanner =new Scanner(System.in);	
	try {
		System.out.println("enter which operation you need to do...press 1 for add,2 for sub,3 for mul and 4 for div..");
       int ch=scanner.nextInt();
		switch(ch) {
		case 1:add();break;
		case 2:sub();break;
		case 3:mul();break;
		case 4:div();break;
}
	}catch(Exception e){
		System.out.println(" some exception is ocured please try again...");
	 e.printStackTrace();
	}
	finally {
	System.out.println("Calculator is ended...");
}
	}

private static void div () throws Exception{
	Scanner scanner=new Scanner(System.in);
	try {
		System.out.println("enter a number..");
		int a=scanner.nextInt();
		System.out.println("enter another number..");
        int b=scanner.nextInt();
        int c=a/b;
        System.out.println("the division result is"+c);
        }
	catch (Exception e) {
		System.out.println("partially handled the exception for division..");
		throw e;
	}
	
}

private static void mul() throws Exception{
	System.out.println("enter a number");
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader bf=new BufferedReader(is);
	int a=bf.read();
	System.out.println("enter another  number");
	bf.readLine();
	int b=bf.read();
	int c=a*b;
	System.out.println("the multiplication result is"+c);

	
}

private static void sub() {
	Scanner scanner =new Scanner(System.in);	
	try {
	System.out.println("enter a number");
	int a=scanner.nextInt();
	System.out.println("enter another number");
	int b=scanner.nextInt();
	int c=a-b;
	System.out.println("the subtraction result is..."+c);

	}
	catch (Exception e) {
     System.out.println("exception in in correct input foro subtraction...");
	}

	
}

private static void add() {
Scanner scanner =new Scanner(System.in);	
System.out.println("enter a number");
int a=scanner.nextInt();
System.out.println("enter another number");
int b=scanner.nextInt();
int c=a+b;
System.out.println("the addition result is..."+c);
}

}
