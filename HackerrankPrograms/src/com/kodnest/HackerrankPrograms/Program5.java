package com.kodnest.HackerrankPrograms;

import java.util.Scanner;

public class Program5 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
	System.out.println("enter how may lines of String");
	int line=scan.nextInt();
	scan.nextLine();
	for(int i=0;i<=line-1;i++) {
		String odd="";
		String even="";
		System.out.println("enter line "+(i+1));
		String s=scan.nextLine();
		int len=s.length();
		for(int j=0;j<=len-1;j++) {
			if(j%2==0) {
				even=even+s.charAt(j);
			}
			else {
				odd=odd+s.charAt(j);
			}
		}
		System.out.println(odd+" "+even);
	}
}
}
