package com.kodnest.Threads002;

public class Program implements Runnable{
@Override
public void run() {
	if(Thread.currentThread().getName().equals("number")) {
		numPrinting();
      }
	else {
	charPrinting();
	}
}
public void numPrinting() {
	try {
	for(int i=1;i<5 ;i++) {
		System.out.println("number "+i);
		Thread.sleep(2000);
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void charPrinting() {
try {
		for(char i='a';i<'e';i++) {
			System.out.println("char "+i);
			Thread.sleep(2000);

		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
