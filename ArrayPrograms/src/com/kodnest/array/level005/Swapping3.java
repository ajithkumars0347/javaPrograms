package com.kodnest.array.level005;

import java.util.Scanner;

public class Swapping3 {
public static void main(String[] args) {
	/*
	 * instantiate the scanner class
	 * ask the user the length of the array and create array of that length
	 * write the method for printing array logics in another class
	 * In printing method write the logic to print array elements in forward as well as in backward direction
	 * call the printing array method from main method  
	 */
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of the array");
    int arr[]=new int[scan.nextInt()];
    System.out.println("enter "+arr.length+" elements to store in an array");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=scan.nextInt();
    }
    Swapping3Printing swapping3Printing=new Swapping3Printing();
    swapping3Printing.printingArray(arr);
}
}
