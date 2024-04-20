package searchingAndSorting;

import java.util.Scanner;

public class SearchingSortingApp {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size of the array...");
	int[] arr=new int[scanner.nextInt()];
	System.out.println("enter "+arr.length+" elements...");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scanner.nextInt();
	}
	System.out.println("before sorting..");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("choose which types of sorting do you want?...press 1 for bubble sort, press 2 for selection sort, press 3 for insertion sort.");
   switch(scanner.nextInt()) {
   case 1: BubbleSort bubbleSort=new BubbleSort();
     arr=bubbleSort.bubble(arr);
     System.out.println("after sorting...");
     for(int x:arr) {
    	 System.out.print(x+" ");
     }
     break;
   case 2: SelectionSort selectionSort=new SelectionSort();
   arr=selectionSort.selection(arr);
   System.out.println("after sorting...");
   for(int x:arr) {
  	 System.out.print(x+" ");
   }
   break;
   case 3:InsertionSort insertionSort=new InsertionSort();
    arr=insertionSort.insertion(arr);
    System.out.println("after sorting...");
    for(int x:arr) {
   	 System.out.print(x+" ");
    }
    break;
   
   default:
	   System.out.println("press a valid number");
   }
	   System.out.println("enter the number to search..");
   int key=scanner.nextInt();
   System.out.println("press 1 to linear search and press 2 for binary search...");   
   switch(scanner.nextInt()) {
       case 1:LinearSearch linearSearch=new LinearSearch();
	   int res=linearSearch.linear(arr, key);
	   if(res!=-1) {
		   System.out.println("key found at "+res+" th index..");
	   }
	   else {
		   System.out.println("key not found...");
	   }
       case 2:BinarySearch binarySearch=new BinarySearch();
       res=binarySearch.binary(arr, key);
       if(res!=-1) {
		   System.out.println("key found at "+res+" th index..");
	   }
	   else {
		   System.out.println("key not found...");
	   }
   }
}
}
