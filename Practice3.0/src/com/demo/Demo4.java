package com.demo;

import java.util.Scanner;

public record Demo4() {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("enter a String ");
    
    String str="hi ajith kumar";
    revpre(str);
}
public static void revpre(String str){
	char[] strChar=str.toCharArray();
	String str2="";
	String str3="";
	for(int i=0;i<=strChar.length-1;i++) {
		
		if(strChar[i]==' ') {
			char[] splitCh=str2.toCharArray();
			for(int j=splitCh.length-1;j>=0;j--) {
				str3=str3+splitCh[j];
			}
			str3=str3+" ";
			str2="";
		}
		else if(i==strChar.length-1) {
			str2=str2+strChar[i];
			char[] splitCh=str2.toCharArray();
			for(int j=splitCh.length-1;j>=0;j--) {
				str3=str3+splitCh[j];
			}
		}
		else {
			str2=str2+strChar[i];
		}
	}
	System.out.println(str3);
}
}
