package numberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a number");
	int num=scanner.nextInt();
	int numSquare=num*num;
	while(num>0) {
		if(num%10!=numSquare%10) {
	        System.out.println("this is not Automorphic number");
		return;
		}
		num=num/10;
		numSquare=numSquare/10;
		}
	System.out.println("this is Automorphic number..");
	
}
}