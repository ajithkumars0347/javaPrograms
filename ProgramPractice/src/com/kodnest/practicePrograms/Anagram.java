package com.kodnest.practicePrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String..");
	String str=scanner.nextLine();
	System.out.println("enter the size of Array...");
	String[] strArr=new String[scanner.nextInt()];
	scanner.nextLine();
	for(int i=0;i<=strArr.length-1;i++) {
		System.out.println("enter "+(i+1)+" th String");
       strArr[i]=scanner.nextLine();	
	}
	for(int i=0;i<=strArr.length-1;i++) {
		if(str.length()==strArr[i].length()) {
             char[] chstr=str.toCharArray();
			char[] chArr=strArr[i].toCharArray();
           Arrays.sort(chstr);
           Arrays.sort(chArr);
           if(Arrays.equals(chstr,chArr)) {
        	   System.out.println(strArr[i]+" is anagram for "+ str);
        	   continue;
           }
		}
		else {
		System.out.println();
	}
}
}
}
