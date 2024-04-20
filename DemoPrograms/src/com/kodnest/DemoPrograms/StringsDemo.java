package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class StringsDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char arr[]=new char[10];
	System.out.println("enter 10 character");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.next().charAt(0);
	}
	for(char x:arr) {
		System.out.print(x+" ");
	}
	char arr2[]=new char[arr.length];
	for(int i=0;i<=arr.length-1;i++) {
	arr2[i]=arr[i];
			}
	for(char x:arr2) {
		System.out.print(x+" ");
	}
	System.out.println();
	char arr3[]=new char[arr2.length];
	for(int i=0;i<=arr.length-1;i++) {
		arr3[i]=arr2[i];
				}
	     int j=arr3.length-1;
	     for(int i=0;i<=arr.length-1;i++) {
	 		System.out.print(arr3[j]+" ");
	 				j--;
	 				}
} 
}
