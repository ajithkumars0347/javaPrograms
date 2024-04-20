package com.kodnest.Strings.level005;

import java.util.Scanner;

public class RemovingRedMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a String");
	RemovingRed redunt=new RemovingRed();
	redunt.red(scanner.nextLine());
}
}
