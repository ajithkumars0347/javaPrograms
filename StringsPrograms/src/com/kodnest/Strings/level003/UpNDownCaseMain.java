package com.kodnest.Strings.level003;

import java.util.Scanner;

public class UpNDownCaseMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	UpNDownCase upNDownCase=new UpNDownCase();
	System.out.println("enter a string");
	upNDownCase.UpNDown(scanner.nextLine());
}
}
