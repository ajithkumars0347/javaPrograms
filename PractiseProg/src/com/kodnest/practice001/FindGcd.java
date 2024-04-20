package com.kodnest.practice001;

public class FindGcd {
public int gcd(int a, int b) {
	int rem;
	while(b!=0) {
	    rem=a%b;
	    a=b;
	    b=rem;
	}
	return a;
}
}
