package com.kodnest.practice004;

import java.util.Scanner;

public class CountingEachCharacter {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String");
	String str=scanner.nextLine();
    char[] chArr=str.toCharArray();
    String temp="";
    for(int i=0;i<=chArr.length-1;i++) {
    	if(!temp.contains(String.valueOf(chArr[i]))) {//instead of this we can use belo code
    	temp=temp+chArr[i];
    	int count=1;
    	for(int j=i+1;j<=chArr.length-1;j++) {
    		if(chArr[j]==chArr[i]) {
    			count++;
    			//chArr[j]==' ';
    		}
    	}
    	System.out.println(chArr[i]+"===>"+count);
    	}
    }
}
}
