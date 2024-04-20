package com.kodnest.array.level004;

import java.util.Scanner;

public class Question1Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of 1st array");
	    int arr1[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr1.length+" elements");
	    for(int i=0;i<arr1.length;i++) {
	    	arr1[i]=scan.nextInt();
	    }
	    System.out.println("enter the length of 2nd array");
	    int arr2[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr2.length+" elements");
	    for(int i=0;i<arr2.length;i++) {
	    	arr2[i]=scan.nextInt();
	    }
	    MergeArray mergeArray=new MergeArray();
	    mergeArray.merge(arr1,arr2);
}
}
