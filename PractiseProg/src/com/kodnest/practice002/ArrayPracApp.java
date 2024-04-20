package com.kodnest.practice002;

import java.util.Scanner;

public class ArrayPracApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("enter number of persons");
    boolean[] arr=new boolean[scanner.nextInt()];
    for(int i=0;i<=arr.length-1;i++) {
    	System.out.println("enter "+(i+1)+" persons maritial status...press true if married else press false...");
    	arr[i]=scanner.nextBoolean();
    }
    System.out.println("maritial lists....");
    for(int i=0;i<=arr.length-1;i++) {
    	if(arr[i]==true) {
    		System.out.println(" person "+(i+1)+" is married");
    	}
    	else {
    		System.out.println(" person "+(i+1)+" is unmarried");
    	}
    }
}
}
