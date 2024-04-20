package com.kodnest.array.level006;

public class Search {
public int searchLinear(int arr[],int key) {
	for(int i=0;i<arr.length;i++) {
		if(key==arr[i]) {
			return i;
		}
	}
	return -1;
}
}
