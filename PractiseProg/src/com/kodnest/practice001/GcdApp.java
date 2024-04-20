package com.kodnest.practice001;

import java.util.Scanner;

public class GcdApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	     System.out.println("enter two numbers...");
	     FindGcd findGcd=new FindGcd();
	     System.out.println("gcd is "+findGcd.gcd(scan.nextInt(),scan.nextInt()));
	}
}
