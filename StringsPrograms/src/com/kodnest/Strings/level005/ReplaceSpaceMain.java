package com.kodnest.Strings.level005;

import java.util.Scanner;

public class ReplaceSpaceMain  {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a string");
     String str=scanner.nextLine();
     System.out.println(str.replace(" ","99"));
}	
}
