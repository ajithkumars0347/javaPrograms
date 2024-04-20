package com.kodnest.Strings.level003;

import java.util.Scanner;

public class StringMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	StringReverseApp stringReverseApp=new StringReverseApp();
	PalindromeCheck palindromeCheck = new PalindromeCheck();
   System.out.println("enter a String");
   String str1=scanner.nextLine();
   System.out.println("entered String is "+str1);
   String str=stringReverseApp.string(str1);
   System.out.println("reversed String is "+str);
   boolean pal=palindromeCheck.isPalindrome(str1,str);
   if(pal==true) {
	   System.out.println("this is palindrome");
   }
   else {
	   System.out.println("this is not  palindrome");
   }
}
}
