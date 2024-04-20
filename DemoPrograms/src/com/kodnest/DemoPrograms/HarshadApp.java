package com.kodnest.DemoPrograms;

public class HarshadApp {
boolean harsh(int num) {
	int help=num;
	int sum=0;
	while(help!=0) {
	int rem=help%10;
	sum=sum+rem;
	help=help/10;
}
	if(num%sum==0)
		return true;
	else 
		return false;
}
}
