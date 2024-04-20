package array;

import java.util.Scanner;

public class ArrayImplementation {
private int arr[];
private Scanner scan=new Scanner(System.in);

public ArrayImplementation(int size) {
	arr=new int[size];
}

public void insert() {
	System.out.println("enter position of array to insert...");
	int pos=scan.nextInt();
	System.out.println("enter the element to insert at position "+pos);
	int element=scan.nextInt();
    arr[pos]=element;
}

public void delete() {
	System.out.println("enter the postion to delete...");
	int pos=scan.nextInt();
	System.out.println(arr[pos]+" is deleted...");
	arr[pos]=0;
}

public void display() {
	System.out.println("the elements are...");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
}
}
