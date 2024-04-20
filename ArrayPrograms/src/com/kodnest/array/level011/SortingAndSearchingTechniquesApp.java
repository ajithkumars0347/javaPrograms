package com.kodnest.array.level011;

import java.util.Scanner;

public class SortingAndSearchingTechniquesApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array size");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter "+arr.length+" elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	SortingAndSearchingTechniques sortingAndSearchingTechniques=new SortingAndSearchingTechniques();
	System.out.println("array elements before sorting...");
	System.out.println("which technique you want to use...choose anyone option given below");
	System.out.println("press 1 to Bubble sort ");
	System.out.println("press 2 to selection sort ");
	System.out.println("press 3 to insertion sort ");
	int ch=scan.nextInt();
	switch(ch) {
	case 1:sortingAndSearchingTechniques.bubbleSort(arr);
	break;
	case 2:sortingAndSearchingTechniques.selectionSort(arr);
    break;
	case 3:sortingAndSearchingTechniques.insertionSort(arr);
	break;
	default:
		System.out.println("enter correct one");
}
	System.out.println("Array elements after sorting...");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("enter key to search");
	int key=scan.nextInt();
	System.out.println("which seaching alogithm you want to perform..press 1 to linear search and press 2 to binary search");
	int ch1=scan.nextInt();
	switch(ch1) {
	case 1:int res=sortingAndSearchingTechniques.linearSearch(arr,key);
	if(res>-1) {
	System.out.println("key found at index "+res);	
	}
	else {
		System.out.println("key not found");
	}
	break;
	case 2:int res1=sortingAndSearchingTechniques.binarySearch(arr,key);
	if(res1>-1) {
	System.out.println("key found at index "+res1);	
	}
	else {
		System.out.println("key not found");
	}
	break;
		
	}
}
}