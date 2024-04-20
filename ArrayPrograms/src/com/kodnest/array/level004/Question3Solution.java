package com.kodnest.array.level004;

import java.util.Scanner;

public class Question3Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of 1st array");
	    int arr1[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr1.length+" elements");
	    for(int i=0;i<arr1.length;i++) {
	    	arr1[i]=scan.nextInt();
	    }
	    System.out.print("before replace==>");
	    for(int x:arr1) {
	    	System.out.print(x+" ");
	    }
	    NegativeToZero NegativeToZero=new NegativeToZero();
	    NegativeToZero.replace(arr1);
	    System.out.println();
	    System.out.print("result after replace==>");
       for(int x:arr1) {
    	   System.out.print(x+" ");
       }
	}
}