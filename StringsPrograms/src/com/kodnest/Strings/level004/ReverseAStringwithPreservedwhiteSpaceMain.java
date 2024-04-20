package com.kodnest.Strings.level004;

import java.util.Scanner;

public class ReverseAStringwithPreservedwhiteSpaceMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ReverseAStringwithPreservedwhiteSpace reverseAStringwithPreservedwhiteSpaceMain = new ReverseAStringwithPreservedwhiteSpace();
	System.out.println("enter a String");
	String str=scanner.nextLine();
	reverseAStringwithPreservedwhiteSpaceMain.revpr(str);
}
}
