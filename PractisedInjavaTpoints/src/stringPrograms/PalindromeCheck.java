package stringPrograms;

import java.util.Scanner;

public class PalindromeCheck {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a string...");
	String str=scanner.nextLine();
	char[] chArr=str.toCharArray();
	char[] newStr=new char[chArr.length];
	int len=chArr.length-1;
	for(int i=0;i<=chArr.length-1;i++) {
		newStr[len-i]=chArr[i];
	}
	String str2=new String(newStr);
	if(str.equals(str2)) {
		System.out.println("Palindriome...");
	}
	else {
		System.out.println("Not palindrome...");
	}
}
}
