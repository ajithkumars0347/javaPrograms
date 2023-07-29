package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern6 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}

			for(int s=(i*2)-1;s>=1;s--) {
			System.out.print(s);
			}
		System.out.println();
	}

}
}
