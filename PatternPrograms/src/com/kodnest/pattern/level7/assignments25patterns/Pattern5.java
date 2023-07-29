package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern5 {
public static void main(String[] args) {
	char ch='A';
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=(i*2)-1;j++) {
			System.out.print(ch);
		}
		ch++;
		System.out.println();
	}
}
}
