package com.kodnest.practicePrograms;

import java.util.Scanner;

public class FindDuplicateStringInArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size of Array...");
	String[] strArr=new String[scanner.nextInt()];
	scanner.nextLine();
	for(int i=0;i<=strArr.length-1;i++) {
		System.out.println("enter "+(i+1)+" th String");
       strArr[i]=scanner.nextLine();	
	}
	for(int i=0;i<=strArr.length-1;i++) {
		for(int j=i+1;j<=strArr.length-1;j++) {
			if(strArr[i]!=null) {
			if(strArr[i].equals(strArr[j])) {
				System.out.println(strArr[j]+" at the index of "+j );
				strArr[j]=null;
			}
			}
		}
	}
}
}
