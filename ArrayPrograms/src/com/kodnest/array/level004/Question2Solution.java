package com.kodnest.array.level004;

import java.util.Scanner;

public class Question2Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of 1st array");
	    int arr1[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr1.length+" elements");
	    for(int i=0;i<arr1.length;i++) {
	    	arr1[i]=scan.nextInt();
	    }
	    int arr2[]=new int[arr1.length];
	    System.out.println("enter"+arr2.length+" elements");
	    for(int i=0;i<arr2.length;i++) {
	    	arr2[i]=scan.nextInt();
	    }
	    SummingTheElements summingTheElements=new SummingTheElements();
	    int arr3[]=summingTheElements.sum(arr1,arr2);
	    System.out.print("first array elements==> ");
	    for(int x:arr1) {
	    	System.out.print(x+" ");
	    }
	    System.out.println();
	    System.out.print("second array elements==> ");
	    for(int x:arr2) {
	    	System.out.print(x+" ");
	    }
	    System.out.println();
		System.out.print("sum of corresponding array elements==> ");
		for(int x:arr3) {
			System.out.print(x+" ");
		}

}
}
