package basicPrograms;

import java.util.Scanner;

public class FibonacciUsingRecursion {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter count...");
int count=scanner.nextInt();
int a=0,b=1;
int c;
System.out.print(a+" "+b+" ");
rec(a,b,count);
}
public static void rec(int x,int y,int count) {
	int z=x+y;
	System.out.print(z+" ");
	count--;
	if(count==0)
		return;
	rec(y,z,count);
}
}
