package simplePrograms;

import java.util.Scanner;

public class Solution5 {
Scanner scan=new Scanner(System.in);
	
    
	public void divisibleBy3And5() {
		System.out.println("enter the number,up to where you want to print");
		for(int i=0;i<=scan.nextInt();i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}
}
