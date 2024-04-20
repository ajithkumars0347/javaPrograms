package com.kodnest.array.level004;

public class NegativeToZero {
public void replace(int arr1[]) {
	for(int i=0;i<arr1.length;i++) {
		if(arr1[i]<0) {
			arr1[i]=0;
		}
	}
}
}
