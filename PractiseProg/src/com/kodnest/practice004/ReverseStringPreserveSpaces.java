package com.kodnest.practice004;

import java.util.Scanner;

public class ReverseStringPreserveSpaces {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a string..");
	String str=scanner.nextLine();
     ReverseString reverseString=new ReverseString();
     String str1=reverseString.rev(str);
     System.out.println(str1);
}
}
