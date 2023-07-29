package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern9 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}
        for(int s=i;s>=1;s--){
              System.out.print(s-1);
        }
        for(int t=1;t<=i-1;t++) {
        	System.out.print(t);
        }
		System.out.println();
	}

}
}
