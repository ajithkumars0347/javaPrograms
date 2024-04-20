package com.kodnest.practicePrograms;

import java.util.Scanner;

public class FindPalindromeStringInArray2 {
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
				if(strArr[j]!=null && strArr[i].length()==strArr[j].length()) {
				String dup="";
					for(int k=strArr[j].length()-1;k>=0;k--) {
      				dup=dup+strArr[j].charAt(k);
					
				}
					if(dup.equals(strArr[i])) {
						System.out.println(strArr[j]+" is palindrome for "+strArr[i]+" at the index of "+j);
						strArr[j]=null;
					}
				}
			}
		}
	}
}