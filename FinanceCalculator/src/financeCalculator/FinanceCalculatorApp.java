package financeCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal amount");
		double p=scan.nextDouble();
		System.out.println("enter rate of interest");
		double r=scan.nextDouble();
		System.out.println("enter years");
		double t=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(p, r, t));
	}

}
