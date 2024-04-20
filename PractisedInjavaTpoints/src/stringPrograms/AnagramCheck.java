package stringPrograms;
import java.util.Arrays;

import java.util.Scanner;

public class AnagramCheck {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String...");
	String str3=scanner.nextLine();
	String str=str3.toLowerCase();
	String str1=scanner.nextLine();
	String str2=str1.toLowerCase();
	if(str.length()==str2.length()) {
		char[] strArr1=str.toCharArray();
		char[] strArr2=str2.toCharArray();
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		if(Arrays.equals(strArr1,strArr2)) {
			System.out.println("this is ANAGRAM..");
		}
		else {
			System.out.println("this is not ANAGRAM..");
		}
	}
	else {
		System.out.println("this is not ANAGRAM...");
	}
	
}
}
