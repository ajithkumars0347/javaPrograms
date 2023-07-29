package primeCheck;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				System.out.println("not prime");
				return;
			}
		}
       System.out.println("prime");
	}

}
