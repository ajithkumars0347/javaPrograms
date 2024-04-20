package com.kodnest.Strings.level003;

public class UpNDownCase {
void UpNDown(String str) {
	int upperCount=0;
	int lowerCount=0;
	String strCharChange=null;
	for(int c=0;c<=str.length()-1;c++) {
		int str1=str.charAt(c);
		if(str1>=97 && str1<=122) {
			lowerCount++;
		}
		else {
			upperCount++;
		}
	}
	System.out.println("number of upperCases "+upperCount+"\nand number of lowerCases are "+lowerCount);
   System.out.println("this is converted in UpperCase "+str.toUpperCase());
   System.out.println("this is converted in lowerCase "+str.toLowerCase()); 
   for(int c=0;c<=str.length()-1;c++) {
		int str1=str.charAt(c);
		if(str1>=97 && str1<=122) {
			
		}
		else {
			upperCount++;
		}
	}
}
}
