package fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please,enter a number that how many number you want in fibocci series");
        int n=scan.nextInt();
        fibonacci(n);
	}
public static void fibonacci(int n) {
	int fib1=0,fib2=1;
	
	switch(n) {
	case 1:
		System.out.println(fib1);
	case 2:
		System.out.println(fib1+" "+fib2);
	default:
		System.out.print(fib1+" "+fib2+" ");
		  for(int i=3;i<=n;i++) {
			  int nextNo=fib1+fib2; 
			  System.out.print(nextNo+" ");
			     fib1=fib2;
                 fib2=nextNo;
		  }
	}
}
}
