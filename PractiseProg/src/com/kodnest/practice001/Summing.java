package com.kodnest.practice001;

public class Summing {
	public int sum(int n,int count) {
		PowerCal cal=new PowerCal();
		int Tres=0;
         while(n!=0) {
        	 int rem=n%10;
		int res=cal.powCal(rem,count);
		Tres=Tres+res;
		n=n/10;
         }
	return Tres;	
	}
}
