package com.kodnest.ControlContruct.level1;

public class QuadrantFinder {
	void QuadrantFind(int x,int y){
		if(x>0 && y>0) {
			System.out.println("this is belongs to 1st quadrant");
		}
		else if(x<0 && y>0) {
			System.out.println("this is belongs to 2nd quadrant");
		}
		else if(x<0 && y<0) {
			System.out.println("this is belongs to 3rd quadrant");
		}
		else if(x>0 && y<0) {
			System.out.println("this is belongs to 4th quadrant");
		}
		else if(x==0 && y!=0) {
			System.out.println("this is on the Y th line");
		}
		else if(x!=0 && y==0) {
			System.out.println("this is on the X th line");
		}
		else if(x==0 && y==0) {
			System.out.println("this is origin");
		}
		
	}
}
