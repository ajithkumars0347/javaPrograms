package com.kodnest.DemoPrograms;

public class FactorialOfDigit {
int findFact(int digit) {
    int rem=0;
    int fact=1;
	for(int i=1;i<=digit;i++) {
		fact=fact*i;
	}
	return fact;
}
}