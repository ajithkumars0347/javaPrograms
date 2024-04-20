package com.kodnest.array.level002;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
	    int arr[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr.length+" elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=scan.nextInt();
	    }
	    	int arr2[]=new int[arr.length];
	    	for(int j=0;j<arr.length;j++) {
	    		arr2[j]=arr[j];
	    	}
	    	System.out.println("original array....");
	    	for(int a1:arr) {
	    		System.out.print(a1+" ");
	    	}
	    	System.out.println();
	    		System.out.println("copied array...");
	    	for(int a2:arr2) {
	    		System.out.print(a2+" ");
	    	}
	    }
	    
}

