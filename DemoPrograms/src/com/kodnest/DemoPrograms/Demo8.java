package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo8 {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("enter base and power");
 PowerValueApp powerValueApp=new PowerValueApp();
 System.out.println("the value of given number is "+powerValueApp.powerPerform(scanner.nextInt(),scanner.nextInt()));
System.out.println("enter again");
System.out.println("by using inbuilt method ans is "+(int)(Math.pow(scanner.nextInt(),scanner.nextInt())));
}
}
