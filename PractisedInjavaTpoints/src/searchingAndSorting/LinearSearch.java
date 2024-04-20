package searchingAndSorting;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter number of elements...");
	int[] arr=new int[scanner.nextInt()];
    System.out.println("enter "+(arr.length)+" element which should be in ordered one...");
   for(int i=0;i<=arr.length-1;i++) {
	   arr[i]=scanner.nextInt();
   }
   System.out.println("enter a number to search...");
   int key=scanner.nextInt();
    for(int i=0;i<=arr.length-1;i++) {
    	if(arr[i]==key) {
    		System.out.println("key found..at the index of "+i);
    		return;
    	}
    }
    System.out.println("key is not found...");
}
}
