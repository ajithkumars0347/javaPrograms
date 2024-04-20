package com.kodnest.practicePrograms;

public class FindStringLengthwithoutLength {
public static void main(String[] args) {
	String str="ajithkumar";
	int count=0;
	char[] strArr=str.toCharArray();
	for(char i:strArr) {
		count++;
	}
	System.out.println(count);
}
}
