package conversion;

import java.util.Scanner;

public class StringToInt {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number String...");
	String str=scanner.next();
	System.out.println(Integer.parseInt(str));
}
}
