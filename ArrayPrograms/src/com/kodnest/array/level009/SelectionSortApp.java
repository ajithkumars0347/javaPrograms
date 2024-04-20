package com.kodnest.array.level009;

import java.util.Scanner;

public class SelectionSortApp {
	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the length os the array");
		  int arr[]=new int[scan.nextInt()];
		  System.out.println("enter "+arr.length+"elements");
		   for(int i=0;i<arr.length;i++) {
			   arr[i]=scan.nextInt();
		   }
		   System.out.println("array elements before sorting...");
		   for(int x:arr) {
			   System.out.print(x+" ");
		   }
		   SelectionSort selectionSort=new SelectionSort();
		   selectionSort.sort(arr);
		   System.out.println();
		   System.out.println("array elements after sorting...");
		   for(int x:arr) {
			   System.out.print(x+" ");
		   }
}
}
