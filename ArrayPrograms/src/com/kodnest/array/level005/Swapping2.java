package com.kodnest.array.level005;

import java.util.Scanner;

public class Swapping2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of the array");
    int arr[]=new int[scan.nextInt()];
    System.out.println("enter "+arr.length+" elements to store in an array");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=scan.nextInt();
    }
    System.out.println("enter the 2 index nos to change the value in array");
    int a=scan.nextInt();
    int b=scan.nextInt();
    System.out.println("before swapping the values in array are=");
     for(int i:arr) {
    System.out.print(i+" ");
     }
     System.out.println();
     int help=arr[a];
     arr[a]=arr[b];
     arr[b]=help;
     System.out.println("after swapping the values in array are=");
     for(int i:arr) {
    	 System.out.print(i+" ");
     }
      
}

}
