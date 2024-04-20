package com.kodnest.practice003;

public class Type2 {
public static void main(String[] args) {
	
	for(int i=0;i<=5;i++) {
		char ch='A';
		for(int j=i;j<=5;j++) {
			System.out.print(ch);
			ch++;
		}
		for(int j=0;j<=(i*2)-1;j++) {
			System.out.print(" ");
		}
		ch--;

		for(int j=i;j<=5;j++) {
			System.out.print(ch);
			ch--;
		}
		System.out.println();
	}
}
}
