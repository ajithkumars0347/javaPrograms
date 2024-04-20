package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of the array");
    int []arr=new int[scan.nextInt()];
    System.out.println("enter "+arr.length+" values");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=scan.nextInt();
    }
    for (int i : arr) {
		if(i>=0) {
			System.out.println(i+" ");
	}
    }
}
}
