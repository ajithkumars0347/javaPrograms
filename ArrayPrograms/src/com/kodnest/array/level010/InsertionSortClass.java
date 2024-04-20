package com.kodnest.array.level010;

public class InsertionSortClass {
void insertionSortMethod(int arr[]) {
	for(int i=1;i<=arr.length-1;i++) {
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
}
}
