package com.kodnest.DemoPrograms;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] kodnest) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		byte nextByte = scanner.nextByte();
		short nextShort = scanner.nextShort();
		double nextDouble = scanner.nextDouble();
		float nextFloat = scanner.nextFloat();
		boolean nextBoolean = scanner.nextBoolean();
		long nextLong = scanner.nextLong();
		String nextLine = scanner.nextLine();
		int a = 40;
		byte b = (byte) (a + 40 + (5 / 2));
		short c = (short) (49 / 4);
		double d = (c + b + a) * 5;
		System.out.println(d);
	}
}
