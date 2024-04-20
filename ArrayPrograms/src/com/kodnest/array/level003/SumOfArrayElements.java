package com.kodnest.array.level003;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
	    int arr[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr.length+" elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=scan.nextInt();
	    }
	    Sum sum=new Sum();
	    int res=sum.summing(arr);
	    System.out.println("the sum of array element is "+res);
	}
	    
}
	    
