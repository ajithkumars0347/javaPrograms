package com.kodnest.DemoPrograms;
import java.util.Scanner;
public class ArrayPractice {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Employee emp[]=new Employee[5];
for(int i=0;i<=emp.length-1;i++) {
	System.out.println(emp[i].name);
	System.out.println(emp[i].age);
}
}
}
