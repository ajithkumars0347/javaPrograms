package arrayConcepts;

import java.util.Scanner;

public class StringConceptOtherway {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter a String...");
String str=scanner.nextLine();
System.out.println("enter a character...");
char ch=scanner.next().charAt(0);
for(int i=0;i<=str.length();i++) {
	if(str.charAt(i)==ch) {
		for(int j=i+1;j<str.length();j++) {
			System.out.print(str.charAt(j));
		}
		return;
	}
}
System.out.println(str);
}
}
