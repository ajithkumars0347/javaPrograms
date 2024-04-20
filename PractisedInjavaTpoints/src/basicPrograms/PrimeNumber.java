package basicPrograms;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scanner =new  Scanner(System.in);
	System.out.println("enter number");
	int n=scanner.nextInt();
	if(n==0 || n==1) {
		System.out.println(n+" is not prime number");
	}
	else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				return;
			}
		}System.out.println(n+" is prime number");
		
	}
}
}
