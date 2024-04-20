package com.kodnest.array.level006;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
	    int arr[]=new int[scan.nextInt()];
	    System.out.println("enter"+arr.length+" elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=scan.nextInt();
	    }
	    System.out.println("enter the element to search");
	    int target=scan.nextInt();
	    Search1 search1=new Search1();
	    boolean res=search1.searchLinear(arr, target);
	    if(res==true) {
	    	System.out.println("element found at the index ");
	    	}
	    else {
	    	System.out.println("element not found");
	    }
	}

}
