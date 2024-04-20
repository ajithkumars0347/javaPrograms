package com.kodnest.practice005;

public class LinearSearch {
public void LSearch(Student[] stu,int key) {
	for(int i=0;i<=stu.length-1;i++) {
		if(stu[i].id==key) {
			System.out.println("key found at the index "+i);
			return;
		}
		
	}
	System.out.println("key not found...");
}
}
