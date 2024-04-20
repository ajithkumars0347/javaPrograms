package binarySearch;

import java.util.Scanner;

public class BinarySearchApp {
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
    BinarySearch binarySearch=new BinarySearch();
    int ind=binarySearch.binarySearchMethod(arr,key);
    if(ind>=0) {
    System.out.println("key found at "+ind+" place in array");
}
    }
}
