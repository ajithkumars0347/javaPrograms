package com.kodnest.HackerrankPrograms;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=4;
		Double d=4.0453543;
		String s="Kodnest ";

		int i2=scan.nextInt();
		double d2=scan.nextFloat();
		double d3=d+d2;
		double d21=Double.parseDouble(String.format("%.3f",d3));
		scan.nextLine();		
		String s2=scan.nextLine();

		System.out.println(i+i2);

		System.out.println(d21);
		System.out.println(s+s2);

	}           
}
