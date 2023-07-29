package findGCD;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("please,enter two numbers to find the gcd");
	 int m=scan.nextInt();
	 int n=scan.nextInt();
	 GCDApp gcdApp=new GCDApp();
     System.out.println("the gcd of "+m+" and "+n+" is "+gcdApp.gcdMethod(m,n));
	}
	int gcdMethod(int m,int n) {
		while(n!=0)
		{
		int rem=m%n;
		m=n;
		n=rem;
		}
		return m;
	}

}
