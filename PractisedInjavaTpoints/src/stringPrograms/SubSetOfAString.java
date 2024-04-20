package stringPrograms;

import java.util.Scanner;

public class SubSetOfAString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String...");
	String str=scanner.nextLine();
	for(int i=0;i<=str.length()-1;i++) {
		String sub="";
		for(int j=i;j<=str.length()-1;j++) {
		sub=sub+str.charAt(j);
		System.out.println(sub);
	}
		}
}
}
