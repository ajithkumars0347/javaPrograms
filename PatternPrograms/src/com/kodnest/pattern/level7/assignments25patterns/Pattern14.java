package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern14 {
public static void main(String[] args) {
	for(int i=4;i>=1;i--) {
		for(int k=4;k>=i+1;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=(i*2)-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++) {
		for(int k=3;k>=i;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=(i*2)-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}
