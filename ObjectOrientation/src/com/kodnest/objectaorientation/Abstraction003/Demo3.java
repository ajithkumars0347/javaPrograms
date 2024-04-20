package com.kodnest.objectaorientation.Abstraction003;

public class Demo3 implements Demo1,Demo2 {

	@Override
	public void display() {
     System.out.println("this is demo1s");
	}
	public void display2() {
		System.out.println("this is demo2s..");
	}

}
