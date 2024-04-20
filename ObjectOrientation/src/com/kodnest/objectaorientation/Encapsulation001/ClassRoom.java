package com.kodnest.objectaorientation.Encapsulation001;

public class ClassRoom {
private int temp;
public void setTemperature(int x) {
	if(x>10 && x<35) {
		temp=x;
	}
	else {
		System.out.println("Invalid temperature!");
	}
}
	public int getTemperature() {
		return temp;
	}
}

