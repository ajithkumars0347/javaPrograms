package com.kodnest.DemoPrograms;

import java.util.Scanner;

public class Demo16 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a range to check perfect number");
    PerfectNumCheck perfectNumCheck=new PerfectNumCheck();
    int num=scanner.nextInt();
    int num2=scanner.nextInt();
    System.out.print("perfect numbers are==>");
    for(int i=num;i<=num2;i++) {
    int finalRes=perfectNumCheck.perfect(i);
    if(finalRes==i) {
    	System.out.print(i+" ");
    }
}
}
}