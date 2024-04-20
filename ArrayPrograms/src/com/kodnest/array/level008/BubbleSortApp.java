package com.kodnest.array.level008;

import java.util.Scanner;

public class BubbleSortApp {
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
   System.out.println();
   BubbleSort bubbleSort=new BubbleSort();
   bubbleSort.sort(arr);
   System.out.println();
   System.out.println("after sorting ");
   for(int x:arr) {
	   System.out.print(x+" ");
   }
}
}
