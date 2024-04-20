package com.kodnest.practice004;

import java.util.Scanner;

public class PalindromeAnotherWay {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any String...");
		String str = scanner.nextLine();
		char[] strChar=str.toCharArray();
         char[] arr= new char[strChar.length];
         int j=arr.length-1;
         for(int i=0;i<=arr.length-1;i++) {
        	 arr[j]=strChar[i];
        	 j--;
         }
         String str1=new String(arr);
         if(str.equals(str1)) {
        	 System.out.println("palindrome...");
         }
         else {
        	 System.out.println("NOT palindrome...");
         }
	}
}
