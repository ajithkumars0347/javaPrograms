package com.kodnest.practice005;

public class InsertionSort {
public void ISort(Student[] stu) {
	for(int i=1;i<=stu.length-1;i++) {
		int item=stu[i].id;
		Student pos=stu[i];
		int j=i-1;
		while(j>=0 && item<stu[j].id) {
		     stu[j+1]=stu[j];
		     j--;
		}
		stu[j+1]=pos;
	}
	for(Student x:stu) {
		   System.out.println(x.name+" "+x.id);
	     x.study();
	   }
}
}
