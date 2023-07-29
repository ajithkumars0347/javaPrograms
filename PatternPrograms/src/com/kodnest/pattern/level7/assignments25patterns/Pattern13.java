package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern13 {
public static void main(String[] args) {
	for(int i=4;i>=1;i--) {
		for(int k=4;k>=i+1;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=(i*2)-1;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
