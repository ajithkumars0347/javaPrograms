package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern2 {
public static void main(String[] args) {
	for(char i='E';i>='A';i--) {
		for(char j='A';j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
