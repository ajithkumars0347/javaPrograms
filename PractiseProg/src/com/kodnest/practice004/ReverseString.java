package com.kodnest.practice004;

public class ReverseString {
public String  rev(String str) {
	char[] str1=str.toCharArray();
	char[] arr=new char[str1.length];
	int j=str1.length-1;
	for(int i=0;i<=str1.length-1;i++) {
		if(str1[i]==' ') {
			arr[i]=str1[i];
		}
	}
	for(int i=0;i<=str1.length-1;i++) {
		if(arr[j]==' ') {
			j--;
		}
		if(str1[i]!=' ') {
			arr[j]=str1[i];
			j--;
		}
	}
 String modified = new String(arr);
 return modified;
}
}
