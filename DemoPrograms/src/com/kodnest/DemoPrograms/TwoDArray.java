package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
    System.out.println("enter 1-d length");
		double arr[][][]=new double[scan.nextInt()][][];
		System.out.println("enter 2-d length");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter"+i+"array length");
			arr[i]=new double[scan.nextInt()][];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter 3-d array for"+i+" th "+j+" array length");
				arr[i][j]=new double[scan.nextInt()];
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
	   for(int j=0;j<=arr[i].length-1;j++) {
		   for(int k=0;k<=arr[i][j].length-1;k++) {
		   System.out.println("enter element "+(i+1)+"row "+(j+1)+" column");
           arr[i][j][k]=scan.nextDouble();
	   }
   }
		}
   for(int i=0;i<=arr.length-1;i++) {
	   for(int j=0;j<=arr[i].length-1;j++) {
		   for(int k=0;k<=arr[i][j].length-1;k++) {
			   
		   System.out.print(arr[i][j][k]+" ");
	   }
	   System.out.println();
   }
	}
}
	}