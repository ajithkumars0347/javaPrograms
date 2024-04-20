package com.kodnest.practice004;

import java.util.Scanner;

public class ReverseEachWord {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String...");
	String str=scanner.nextLine();
	String str1[]=str.split(" ");
	String revString="";
	for(int i=0;i<=str1.length-1;i++) {
		char[] chArr=str1[i].toCharArray();
		char[] chStr=new char[chArr.length];
		int last=chArr.length-1;
		for(int j=0;j<=chStr.length-1;j++) {
			chStr[last]=chArr[j];
			last--;
		}
		String revWord=new String(chStr);
		revString=revString+revWord+" ";
	}
	System.out.println(revString);
}
}
