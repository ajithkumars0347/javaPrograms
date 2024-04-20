package com.kodnest.practice001;

import java.util.Scanner;

public class ArmStrongApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scan.nextInt();
	Count count=new Count();
    int totdig=count.counting(n);
    Summing summing=new Summing();
    int Fres=summing.sum(n,totdig);
    if(Fres==n) {
    	System.out.println("this is ArmStrong");
    }
    else {
    	System.out.println("this is not ArmStrong");
    }
}
}
