package com.kodnest.objectaorientation.Polymorohism001;

public class AnimalApp {
public static void main(String[] args) {
	CallingType ct=new CallingType();
	ct.callAnimalFun(new Tiger());
	ct.callAnimalFun(new Deer());
	ct.callAnimalFun(new Monkey());
}
}
