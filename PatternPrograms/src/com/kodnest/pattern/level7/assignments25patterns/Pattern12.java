package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern12 {
public static void main(String[] args) {
	for(int i=65;i<=70;i++) {
		for(int k=69;k>=i;k--) {
			System.out.print(" ");
		}
        for(int s=65;s<=i;s++){
              System.out.print((char)s);
        }
        for(int t=65;t<i;t++) {
        	System.out.print((char)t);
        }
		System.out.println();
	}

}
}
