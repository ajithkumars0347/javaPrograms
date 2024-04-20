package com.kodnest.objectsType.Program001;

import java.util.Scanner;

public class StudentObjMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter how many object you want");
	StudentObj arr[]=new StudentObj[scanner.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("enter "+(i+1)+" id ");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter "+(i+1)+" name ");
		String name=scanner.nextLine();
		System.out.println("enter "+(i+1)+" mark ");
		int mark=scanner.nextInt();
		arr[i]= new StudentObj(id,name,mark);
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].mark+" | ");
	}
	scanner.nextLine();
	System.out.println();
	System.out.println("enter name to search");
	String strKey=scanner.nextLine();
    boolean flag=false;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i].name.equals(strKey)) {
			System.out.println("name found!");
			flag=true;
		}
	}
	if(!flag) {
	System.out.println("name is not found!");
	}
	System.out.println("I want to sort the array:press true or false");
	boolean bool=scanner.nextBoolean();
	if(bool==true) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j+1].id<arr[j].id) {
					StudentObj help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].mark+" | ");
	}
	System.out.println("enter the id to search");
	int idKey=scanner.nextInt();
	flag=false;
		int low=arr[0].id;
		int high=arr[arr.length-1].id;
		int mid;
		while(low>high) {
			mid=(low+high)/2;
			if(arr[mid].id==idKey) {
				System.out.println("key found name is "+arr[mid].name);
			  flag=true;
			}
			else if(idKey>arr[mid].id) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	if(!flag) {
		System.out.println("key not found!");
	}
	System.out.println("rate this application out of 10");
    for(int i=0;i<=scanner.nextInt()-1;i++) {
    	System.out.print("* ");
    }
    System.out.println("thanks for rating...");
}
}
