package com.kodnest.ControlContruct.level1;

import java.util.Scanner;

public class Question1Solution {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter x and y values");
	int x=scan.nextInt();
	int y=scan.nextInt();
    QuadrantFinder quadrantFinder=new QuadrantFinder();
    quadrantFinder.QuadrantFind(x,y);
}
}
