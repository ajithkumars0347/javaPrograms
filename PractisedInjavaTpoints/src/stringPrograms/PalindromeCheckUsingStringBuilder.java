package stringPrograms;

import java.util.Scanner;

public class PalindromeCheckUsingStringBuilder {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String...");
	String str=scanner.nextLine();
	StringBuilder builder=new StringBuilder(str);
	StringBuilder builder2=builder.reverse();
	String str2=new String(builder2);
	if(str.equals(str2)) {
		System.out.println("palindrom...");
	}
	else {
		System.out.println("Not panlindrom...");
	}
}
}
