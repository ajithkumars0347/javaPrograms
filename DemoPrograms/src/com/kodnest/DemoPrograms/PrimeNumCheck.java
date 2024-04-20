package com.kodnest.DemoPrograms;

public class PrimeNumCheck {
boolean primeCheck(int n) {
	if(n==0||n==1) {
		return false;
	}
	else if(n==2) {
		return true;
	}
	else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
	return true;
	}
}
}
