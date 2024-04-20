package com.kodnest.practice005;

public class BubbleSort {
public void BSort(Student[] stu) {
   for(int i=0;i<=stu.length-2;i++) {
	   for(int j=0;j<=stu.length-2-i;j++) {
		   if(stu[j].id>stu[j+1].id) {
			   Student help=stu[j];
			   stu[j]=stu[j+1];
			   stu[j+1]=help;
		   }
	   }
   }
   for(Student x:stu) {
	   System.out.println(x.name+" "+x.id);
     x.study();
   }
}
}
