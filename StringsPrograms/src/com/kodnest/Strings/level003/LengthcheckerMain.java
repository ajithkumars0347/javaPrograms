package com.kodnest.Strings.level003;

import java.util.Scanner;

public class LengthcheckerMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LengthChecker checker=new LengthChecker();
		System.out.println("enter two String");
		boolean res=checker.lengthCheck(scanner.nextLine(),scanner.nextLine());	
		if(res==true) {
			System.out.println("strings lengths are same");
		}
		else {
			System.out.println("Strings lengths are not same");
		}
	}
}
