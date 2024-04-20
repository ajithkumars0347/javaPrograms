package com.kodnest.Threads001;

public class Program extends Thread {
public void run() {
	Thread th1=Thread.currentThread();
    System.out.println(th1);
}
}
