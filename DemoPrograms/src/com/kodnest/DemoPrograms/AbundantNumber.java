package com.kodnest.DemoPrograms;

public class AbundantNumber {
void abun(int num) {
	int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
	if(sum>num) {
		System.out.println("entered number is abundant number");
	}
	else if(sum<num) {
		System.out.println("entered number is deficient number");
	}
	else {
		System.out.println("this is perfect number");
	}
}
}
