package stringPrograms;

import java.util.Scanner;

public class VowelsAndConsonents {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a String...");
	String str=scanner.nextLine();
	int vowels=0;
	int consonents=0;
	for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u') {
			vowels++;
		}
		else {
			consonents++;
		}
	}
	System.out.println("vowel: "+vowels+" consonents: "+consonents);
}
}
