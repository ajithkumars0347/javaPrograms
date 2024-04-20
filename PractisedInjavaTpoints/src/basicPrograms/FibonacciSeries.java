package basicPrograms;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1;
	int c;
	Scanner scanner=new Scanner(System.in);
     System.out.println("enter the count of series numbers..");
    int count=scanner.nextInt();
    System.out.print(a+" ");
    System.out.print(b+" ");
   for(int i=2;i<=count;i++) {
	   c=a+b;
	   System.out.print(c+" ");
	   a=b;
	   b=c;
   }
}
}
