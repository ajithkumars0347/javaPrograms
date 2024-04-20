package com.kodnest.exception003;

import java.util.Scanner;

public class DrivingLicenseApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
System.out.println("enter your age...");
int age=scanner.nextInt();
try {
dl(age);
}
catch(UnderAgeException uae) {
	System.out.println("this  msg is from underAgeException");
	uae.printStackTrace();
}
catch(OverAgeException oae) {
	System.out.println("this  msg is from OverAgeException");
	oae.printStackTrace();

}
catch(Exception e) {
	System.out.println("this msg is from GeneralException");
	e.printStackTrace();

}
}
public static void dl(int age) throws UnderAgeException,OverAgeException,Exception {
		if(age>18 && age<65) {
			System.out.println("you are eligible..go and take test drive..");
		}
		else if(age<18){
			throw new UnderAgeException();
		}
		else if(age>65) {
			throw new OverAgeException();
		}
		else {
			throw new Exception();
		}
	}
	
}

