package com.kodnest.DemoPrograms;

public class StrongNum {
boolean strong(int num) {
	FactorialOfDigit factorialOfDigit=new FactorialOfDigit();
	int help=num;
	int strRes=0;
	while(help!=0) {
		int  digit=help%10;
		int factRes=factorialOfDigit.findFact(digit);
		strRes=strRes+factRes;
		help=help/10;
	}
	if(strRes==num)
	return true;
	else
		return false;
}
}
