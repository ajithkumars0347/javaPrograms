package com.kodnest.DemoPrograms;

public class SumOfDigitApp {
int sumDigit(int a) {
	int sum=0;
	while(a>0) {
    sum=a%10+sum;
    a=a/10;
	}
	return sum;
}
}
