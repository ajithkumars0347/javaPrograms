package discount;

import java.util.Scanner;

public class Discount {
	public static void checkDiscount(double amount) {
		if(amount>100) {
			System.out.println("discount is applicable");
		}
		else
		{
			System.out.println("discount is not applicable");
		}
	}

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter amount");
	   double amount=scan.nextInt();
       checkDiscount(amount);
	}

}
