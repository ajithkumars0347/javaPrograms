package com.kodnest.practicePrograms;

import java.util.Scanner;

public class FindArrayLengthWithoutLengthMethod {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    int arr[]= {10,20,30,40,22,234};
    int count=0;
    for(int x:arr) {
    	count++;
    }
    System.out.println(count);
    
}
}
