package sumOfDigits;

import java.util.Scanner;

public class Main {
	public static void calculateSumOfDigits(int n) {
		int sum=0;
		while(n!=0) {
		int rem=n%10;
		sum=rem+sum;
		n=n/10;
		}
		System.out.println("the sum of digits of this number is "+sum);
		}
		public static void main(String[] args)
		{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the number to find the sum of each digits of that number");
		int n=scan.nextInt();
		Main.calculateSumOfDigits(n);
		}
}
