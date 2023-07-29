package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern4 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=(i*2)-1;j++) {
			System.out.print((i*2)-1);
		}
		System.out.println();
	}

}
}
