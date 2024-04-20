package stringPrograms;

import java.util.Scanner;

public class ReplaceSpaceWithSomething {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String...");
	String str=scanner.nextLine();
    char ch='-';
    String str1=str.replace(' ', ch);
    System.out.println(str1);
}
}
