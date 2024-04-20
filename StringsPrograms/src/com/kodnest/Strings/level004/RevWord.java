package com.kodnest.Strings.level004;

public class RevWord {
void rev(String str) {
	String[] str1=str.split(" ");
	for(int i=0;i<=str1.length-1;i++) {
		char[] splitStr=str1[i].toCharArray();
		char[] eachWord=new char[splitStr.length];
		int k=eachWord.length-1;
		for(int j=0;j<=splitStr.length-1;j++) {
			eachWord[k]=splitStr[j];
			k--;
		}
	   String newStr=new String(eachWord);
	   System.out.print(newStr);
	   System.out.print(" ");
	}
}
}
