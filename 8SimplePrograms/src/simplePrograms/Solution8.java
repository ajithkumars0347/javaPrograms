package simplePrograms;

import java.util.Scanner;

public class Solution8 {
	Scanner scan=new Scanner(System.in);
public  void divisibleBy5andOdd()
{
	System.out.println("enter the range");
	int num=scan.nextInt();
	for(int i=0;i<=num;i++) {
		if(i%5==0 && i%2!=0) {
			System.out.println(i);
		}
	}
}
}
