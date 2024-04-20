package com.kodnest.DemoPrograms;

public class Factorial {
int factorial(int num) {
	int fact=1;
	for(int i=num;i>=1;i--) {
		fact=fact*i;
	}
return fact;
}
}
