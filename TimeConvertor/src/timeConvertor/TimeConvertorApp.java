package timeConvertor;

import java.util.Scanner;

public class TimeConvertorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no.of  minutes");
		int minutes=scan.nextInt();
		System.out.printf("%.2f",convertToHours(minutes));
	}
	public static double convertToHours(int minutes) {
		return minutes/60;
	}
}
