package matrixPrograms;

import java.util.Scanner;

public class AddTwoMatrix {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter matrix type only in the form of square..");
    int row=scanner.nextInt();
    int column=scanner.nextInt();
    int[][] arr=new int[row][column];
    int[][] arr2=new int[row][column];
    System.out.println("enter 1st array elements...");
    for(int i=0;i<=row-1;i++) {
    	for(int j=0;j<=column-1;j++) {
    		arr[i][j]=scanner.nextInt();
    	}
    }
    System.out.println("enter 2nd array elements...");
    for(int i=0;i<=row-1;i++) {
    	for(int j=0;j<=column-1;j++) {
    		arr2[i][j]=scanner.nextInt();
    	}
    }
    int[][] arr3=new int[row][column];
    for(int i=0;i<=row-1;i++) {
    	for(int j=0;j<=column-1;j++) {
    		arr3[i][j]=arr[i][j]+arr2[i][j];
    	}
    }
    System.out.println("added array is...");
    for(int i=0;i<=row-1;i++) {
    	for(int j=0;j<=column-1;j++) {
    		System.out.print(arr3[i][j]+" ");
    	}
    	System.out.println();
    }
}
}
