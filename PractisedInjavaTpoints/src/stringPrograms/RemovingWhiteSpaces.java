package stringPrograms;

import java.util.Scanner;

public class RemovingWhiteSpaces {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String...");
	String str=scanner.nextLine();
	String str1="";
	for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)==' ') {
			continue;
		}
		else {
			str1=str1+str.charAt(i);
		}
	}
	System.out.println(str1);
}
}
