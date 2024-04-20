package com.kodnest.array.level005;

public class Swapping3Printing {
public void printingArray(int arr[]) {
 System.out.println("forward direction...");
	for(int i:arr) {
	 System.out.print(i+" ");
 }
	System.out.println();
	System.out.println("reverse direction...");
	for(int j=arr.length-1;j>=0;j--) {
		System.out.print(arr[j]+" ");
	}
}
}
