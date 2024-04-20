package com.kodnest.DemoPrograms;

public class AutomorphicApp {
boolean autoM(int num) {
	int sqr=num*num;
	while(num!=0) {
		int lastsqr=sqr%10;
		int lastnum=num%10;
		if(lastsqr!=lastnum) {
			return false;
		}
		sqr=sqr/10;
		num=num/10;
	}
	return true;
}
}
