package com.kodnest.Threads002;

public class PrintingApp {
	public static void main(String[] args) {
		Program pr= new Program();
		Thread th=new Thread(pr);
		Thread th2=new Thread(pr);
    th.setName("number");
    th2.setName("char");
th.start();
th2.start();
	}
}
