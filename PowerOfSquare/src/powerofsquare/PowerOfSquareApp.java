package powerofsquare;

import java.util.Scanner;

public class PowerOfSquareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a number");
      int num=scan.nextInt();
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num) {
		return num*num;
	}
}
