package com.kodnest.practice002;

import java.util.Scanner;

public class JaggedArrayPrac {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of schools...");
	int[][][] arr=new int[scanner.nextInt()][][];
	for(int i=0;i<=arr.length-1;i++) {
 System.out.println("enter how many classes in "+i+" th school");
 arr[i]=new int[scanner.nextInt()][];
	}
	for(int i=0;i<=arr.length-1;i++) {
 for(int j=0;j<=arr[i].length-1;j++) {
	 System.out.println("enter class "+(j+1)+" Students in "+i+" school");
	arr[i][j]=new int[scanner.nextInt()];
	}
 }
 for(int i=0;i<=arr.length-1;i++) {
	 for(int j=0;j<=arr[i].length-1;j++) {
		 for(int k=0;k<=arr[i][j].length-1;k++) {
		 System.out.println("enter "+(i+1)+" school of "+(j+1)+" class of "+(k+1)+" th student mark");
      arr[i][j][k]=scanner.nextInt();
	 }
		 }
 }
 for(int k=0;k<=arr.length-1;k++) {
	 System.out.print(k+" school ");
 for(int i=0;i<=arr[k].length-1;i++) {
	 System.out.print("class "+i+" student marks are...");
	 for(int j=0;j<=arr[k][i].length-1;j++) {
		 System.out.print((j+1)+"-"+arr[k][i][j]+",");
	 }
	 System.out.println();
 }
 }
} 
	}