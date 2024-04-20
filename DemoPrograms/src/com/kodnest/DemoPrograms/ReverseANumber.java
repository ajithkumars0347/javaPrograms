package com.kodnest.DemoPrograms;

public class ReverseANumber {
int reverse(int a){
	int rev=0;
	while(a!=0)
	{
	int lastDigit=a%10;
	rev=rev*10+lastDigit;
	a=a/10;
	}
return rev;
}
}
