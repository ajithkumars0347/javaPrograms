package sumOfSeries;

import java.util.Scanner;

public class Main {
	public static void calculateSumOfSeries(int n)
	{
		double sum=0;
        for(double i=1;i<=n;i++) {
        sum=(1/i)+sum;
    }
        System.out.println(sum);
	}

	public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the number which you want to add from 1/1 till the ---");
   int n=scan.nextInt();
   calculateSumOfSeries(n);
	}
}
