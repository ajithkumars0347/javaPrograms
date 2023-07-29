package simplePrograms;

import java.util.Scanner;

public class Solution2 {
Scanner scan=new Scanner(System.in);
	
    
	public void divisibleByThree() {
		System.out.println("enter the number,up to where you want to check");
		for(int i=0;i<=scan.nextInt();i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}
