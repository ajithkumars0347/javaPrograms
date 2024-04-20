package com.kodnest.DemoPrograms;

public class PowerValueApp {
	int powerPerform(int a, int b) {
		int mul=1;
        for(int i=1;i<=b;i++) {
        	mul=mul*a;
        }
        return mul;
	}
}
