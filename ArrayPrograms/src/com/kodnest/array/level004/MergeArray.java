package com.kodnest.array.level004;

public class MergeArray {
public void merge(int arr1[],int arr2[]) {
	int arr3[]=new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++) {
		arr3[i]=arr1[i];
	}
	for(int i=arr1.length;i<arr3.length;i++) {
		 
		arr3[i]=arr2[i-arr1.length];
		
	}
	for(int a3:arr3) {
		System.out.print(a3+" ");
	}
}
}
