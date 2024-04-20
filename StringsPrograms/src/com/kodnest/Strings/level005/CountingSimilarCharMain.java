package com.kodnest.Strings.level005;

import java.util.Scanner;

public class CountingSimilarCharMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a string");
	CountingSimilarChar str=new CountingSimilarChar();
	str.count(scanner.nextLine());
}
}
