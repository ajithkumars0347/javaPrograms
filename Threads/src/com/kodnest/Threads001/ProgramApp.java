package com.kodnest.Threads001;

public class ProgramApp {
public static void main(String[] args) {
	Thread th=Thread.currentThread();
	System.out.println(th);
	
	
	Program pr=new Program();
	pr.setName("myFirstThread");
	pr.start();
	
}
}
