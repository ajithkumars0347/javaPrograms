package com.kodnest.practice005;

public class SelectionSort {
public void SSort(Student[] stu) {
	
	for(int i=0;i<=stu.length-2;i++) {
	 int min=stu[i].id;
	 int pos=i;
	 Student help;
		for(int j=i+1;j<=stu.length-1;j++) {
			if(min>stu[j].id) {
				min=stu[j].id;
				pos=j;
			}
		}
				help=stu[i];
				stu[i]=stu[pos];
				stu[pos]=help;
			}
	for(Student x:stu) {
		   System.out.println(x.name+" "+x.id);
	     x.study();
	   }
	}
}
