package com.kodnest.practice004;

import java.util.Scanner;

public class PalindromeCheckApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter any String...");
	String str= scanner.nextLine();
    StringBuilder stringBuilder=new StringBuilder(str);
    StringBuilder strRev=stringBuilder.reverse();
    String str1=strRev.toString();
    if(str.equals(str1)) {
    	System.out.println("palindrome");
    }
    else {
    	System.out.println("not palindrome..");
    }
}
}
