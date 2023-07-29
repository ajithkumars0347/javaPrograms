package armstrongFind;

import java.util.Scanner;

public class ArmstrongFindApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Armstrong armstrong=new Armstrong();
		System.out.println("enter the number to find the armstrong");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		int res=armstrong.armstrongMethod(original,count);
		if(res==original) {
			System.out.println("getting number is "+res+" so ARMSTRONG");
		}
		else {
			System.out.println("getting number is "+res+" so NOT ARMSTRONG");
		}
	}

}
