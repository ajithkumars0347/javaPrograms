package com.kodnest.Strings.level003;

import java.util.Scanner;

public class ConcatenationMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Concatenate concatenate =new Concatenate();
	System.out.println("enter two Strings");
	String str=concatenate.concate(scanner.nextLine(),scanner.nextLine());
    if(str!=null) {
	System.out.println("concatenated String is "+str);
    }
    else {
    	System.out.println("Strings are not equal");
    }
    }
}
