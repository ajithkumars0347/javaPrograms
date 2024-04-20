package com.kodnest.array.level011;

public class SortingAndSearchingTechniques {
  void insertionSort(int arr[]) {
	for(int i=0;i<=arr.length-1;i++) {
	int item=arr[i];
	int j=i-1;
	while(j>=0 && arr[j]>item) {
		arr[j+1]=arr[j];
		j--;
	}
	arr[j+1]=item;
	}
}
  void selectionSort(int arr[]) {
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
  void bubbleSort(int arr[]) {
	  int help;
	  for(int i=0;i<=arr.length-2;i++) {
		  for(int j=0;j<=arr.length-2-i;j++) {
			  if(arr[j]<arr[j+1]) {
				  help=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=help;
			  }
		  }
	  }
  }
  int linearSearch(int arr[],int key) {
	  for(int i=0;i<=arr.length-1;i++) {
		  if(arr[i]==key) {
			return i; 
		  }
	  }
	  return -1;
  }
  int binarySearch(int arr[],int key) {
	  int low=0;
	  int high=arr.length-1;
	  int mid;
	  while(low<high) {
		  mid=(low+high)/2;
		  if(arr[mid]==key) {
			  return mid;
		  }
		  else if(arr[mid]<key) {
			  low=mid+1;
		  }
		  else {
			  high=mid=1;
		  }
	  }
	  return -1;
  }
}
