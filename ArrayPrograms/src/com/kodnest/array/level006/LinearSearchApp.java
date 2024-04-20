package com.kodnest.array.level006;

import java.util.Scanner;

public class LinearSearchApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of array");
    int arr[]=new int[scan.nextInt()];
    System.out.println("enter"+arr.length+" elements");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=scan.nextInt();
    }
    System.out.println("enter the element to search");
    int key=scan.nextInt();
    Search search=new Search();
    int index=search.searchLinear(arr, key);
    if(index>=0) {
    	System.out.println("element found at the index "+index);
    	}
    else {
    	System.out.println("element not found");
    }
}
}
