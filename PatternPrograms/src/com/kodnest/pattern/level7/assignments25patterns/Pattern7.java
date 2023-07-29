package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern7 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		char ch='A';
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}

			for(int s=1;s<=(i*2)-1;s++) {
			System.out.print(ch);
			ch++;
			}
		System.out.println();
	}

}
}
