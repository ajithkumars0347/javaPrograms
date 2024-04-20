package com.kodnest.DemoPrograms;

public class Fibonacci {
void fibonacci(int n) {
	int a=0;
	int b=1;
	int help;
	System.out.print(a+" "+b+" ");
	for(int i=2;i<=n;i++) {
		help=a+b;
		a=b;
		b=help;
		System.out.print(help+" ");
	}
}
}
