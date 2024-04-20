package com.kodnest.array.level006;

public class Search1 {
	public boolean searchLinear(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				return true;
			}
		}
		return false;
}
}
