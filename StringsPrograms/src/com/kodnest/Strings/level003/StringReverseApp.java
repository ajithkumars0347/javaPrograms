package com.kodnest.Strings.level003;

public class StringReverseApp {
String string(String s1) {
 char[] arr1=s1.toCharArray();
 char[] arr2=new char[arr1.length];
 for(int i=0;i<=arr1.length-1;i++) {
	 arr2[i]=arr1[arr1.length-1-i];
 }
 String s2=new String(arr2);
	return s2;
}
}
