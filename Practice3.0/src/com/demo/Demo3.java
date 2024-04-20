package com.demo;

public class Demo3 {
public static void main(String []args) {
	int[] arr= {20,30,10,30,40};
	int position=removeArray(arr);
	System.out.println();
	for(int i=0;i<=position-1;i++) {
		System.out.print(arr[i]+" ");
	}
}
public static int removeArray(int[] arr){
	int help;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
		   if(arr[j]>arr[j+1]) {
			   help=arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=help;    
		   }
		}
	}
	for(int x:arr) {
		System.out.print(x+" ");
	}
	int rd=0;
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[rd] != arr[i]) {
			rd++;
			arr[rd]=arr[i];
		}
	}
	return rd+1;
}
}
