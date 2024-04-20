package com.kodnest.array.level009;

public class SelectionSort {
void sort(int arr[]) {
	int min;
	int pos;
	int help;
	for(int i=0;i<=arr.length-2;i++) {
	 min=arr[i];
	 pos=i;
	 for(int j=i+1;j<=arr.length-1;j++) {
	 if(min>arr[j]) {
		 min=arr[j];
		 pos=j;
	 }
	 help=arr[i];
	 arr[i]=arr[pos];
	 arr[pos]=help;
	}
	 }
}
}
