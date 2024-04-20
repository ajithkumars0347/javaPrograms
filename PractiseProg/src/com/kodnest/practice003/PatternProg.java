package com.kodnest.practice003;

public class PatternProg {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) {
		for(int j=3;j>i;j--) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=(i*2)-1;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	for(int i=2;i>=1;i--) {
		for(int j=2;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=(i*2)-1;j++) {
		System.out.print(i);	
		}
		System.out.println();
	}
}
}
