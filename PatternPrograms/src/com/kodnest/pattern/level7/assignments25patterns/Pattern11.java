package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern11 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		for(int s=1;s<=i-1;s++) {
			System.out.print(s);
		}
		System.out.println();
	}
}
}
