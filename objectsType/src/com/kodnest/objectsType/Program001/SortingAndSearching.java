package com.kodnest.objectsType.Program001;

public class SortingAndSearching {
boolean linearSearch(StudentObj arr[],int key) {
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i].id==key) {
			return true;
		}
	}
	return false;
}
}
