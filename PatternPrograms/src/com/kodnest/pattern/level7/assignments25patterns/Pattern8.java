package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern8 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}

			for(int a=65+((i*2)-1)-1;a>=65;a--) {
				System.out.print((char)a);
			}
		System.out.println();
	}

}
}
