package com.kodnest.DemoPrograms;

public class Armstrong {
int arms(int a) {
     int lastNum;
     int count=0;
     int help=a;
     int finalvalue=0;
     while(help!=0) {
     help=help/10;
     count++;
     }
     while(a!=0) {
     int tempValue=a%10;
     int value=0;
     value=(int)Math.pow(tempValue,count);
     finalvalue=finalvalue+value;
     a=a/10;
     }
     
	return finalvalue;	
}
}
