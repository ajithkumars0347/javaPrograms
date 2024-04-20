package com.kodnest.practice005;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter how many students are there...");
		Student[] stu=new Student[scanner.nextInt()];
		for(int i=0;i<=stu.length-1;i++) {
			System.out.println("enter id of the student...");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("enter name of the student...");
			String name=scanner.nextLine();
			stu[i]=new Student(name,id);
		}
		System.out.println("press 1 for bubble sort,press 2 for selection sort,press 3 for insertions sort...");
		int ch=scanner.nextInt();
		switch(ch) {
		case 1:
			BubbleSort bubbleSort=new BubbleSort();
			bubbleSort.BSort(stu);
			break;
		case 2:

			SelectionSort selectionSort=new SelectionSort();
			selectionSort.SSort(stu);
			break;
		case 3:

			InsertionSort insertionSort=new InsertionSort();
			insertionSort.ISort(stu);
			break;
		}
		System.out.println("which searching you want to perform...press 1 to linear ,press 2 to binary search...");
	   int ch2=scanner.nextInt();
	   switch(ch2) {
	   case 1:
		   System.out.println("enter a key...");
		   int key=scanner.nextInt();
		   LinearSearch linearSearch=new LinearSearch();
		   linearSearch.LSearch(stu, key);
		   break;
	   case 2:
		   System.out.println("enter a key...");
		   int key1=scanner.nextInt();
		   BinarySearch binarySearch=new BinarySearch();
		   binarySearch.BSearch(stu, key1);
	   }
	}
}