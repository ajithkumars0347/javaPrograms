package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern22 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if((i==1&&j==5)||(j==1&&i==5)||(j==2&&i==4)||(j==4&&i==2)||i==j) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			
		}
		System.out.println();
	}

}
}
