package simplePrograms;

import java.util.Scanner;

public class Solution7 {
Scanner scan = new Scanner(System.in);
public void divisibleBy3even() {
	System.out.println("enter the range");
	int range=scan.nextInt();
	for(int i=0;i<=range;i++) {
		if(i%3==0 && i%2==0) {
			System.out.println(i);
		}
	}
}
}
