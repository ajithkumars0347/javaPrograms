package com.kodnest.pattern.level4;

public class Pattern1 {

	public static void main(String[] args) {
	for(int i=1;i<=2;i++) {
		for(int j=1;j<=10;j++) {
			if(j<=5) {
				System.out.print("$");
			}
			else if(j>5 && j<=10) {
				System.out.print("*");
			}
			else {
				System.out.println();
			}
		}
		System.out.println();
	}

	}

}
