package com.kodnest.Strings.level006;

import java.util.Scanner;

public class AnagramcheckingMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter two Strings");
	String str1=scanner.nextLine();
	String str2=scanner.nextLine();
	char[] str1Arr=str1.toLowerCase().toCharArray();
	char[] str2Arr=str2.toLowerCase().toCharArray();
	if(str1Arr.length==str2Arr.length) {
		AnagramChecking anagramChecking=new AnagramChecking();
		boolean res=anagramChecking.anag(str1Arr, str2Arr);
		if(res==true) {
			System.out.println("these Strings are anagram");
		}
		else {
			System.out.println("these Strings are not anagram");
		}
	}
	else {
		System.out.println("these Strings are not anagram");
	}
	for(String x:args) {
	System.out.print(x+" ");
	}
}
}
