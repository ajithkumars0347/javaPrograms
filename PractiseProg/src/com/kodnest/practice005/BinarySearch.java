package com.kodnest.practice005;

public class BinarySearch {
public void BSearch(Student[] stu,int key) {
	int low=stu[0].id;
	int high=stu.length-1;
	while(high>=low) {
	int mid=(low+high)/2;
	if(stu[mid].id==key) {
		System.out.println("key found at the index "+key);
		return;
	}
	else if(key>stu[mid].id) {
		low=stu[mid].id+1;
	}
	else {
		high=stu[mid].id-1;
	}
	}
	System.out.println("key not found....");
}
}
