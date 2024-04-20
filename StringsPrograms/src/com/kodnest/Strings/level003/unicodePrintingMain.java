package com.kodnest.Strings.level003;

import java.util.Scanner;

public class unicodePrintingMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
   	UnicodePrinting unicodePrinting=new UnicodePrinting();
	System.out.println("enter  a string");
	unicodePrinting.unicode(scanner.nextLine());
}
}
