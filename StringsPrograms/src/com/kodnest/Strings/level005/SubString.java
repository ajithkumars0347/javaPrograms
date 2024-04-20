package com.kodnest.Strings.level005;

public class SubString {
void subString(String str) {
	char[] ch=str.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		String temp="";
		for(int j=i;j<=ch.length-1;j++) {
			temp=String.valueOf(ch[j]);
			System.out.print(temp);
		}
		System.out.println();
	}
}
}
