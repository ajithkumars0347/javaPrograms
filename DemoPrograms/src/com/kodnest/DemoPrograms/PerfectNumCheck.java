package com.kodnest.DemoPrograms;

public class PerfectNumCheck {
int perfect(int num){
	int factRes=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			factRes=factRes+i;
		}
	}
	return factRes;
}
}
