package simplePrograms;

import java.util.Scanner;

public class Solution1 {
	Scanner scan=new Scanner(System.in);
	
    
	public void divisibleByTwo() {
		System.out.println("enter the number,up to where you want to check");
		for(int i=0;i<=scan.nextInt();i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
