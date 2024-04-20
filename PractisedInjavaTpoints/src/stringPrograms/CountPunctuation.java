package stringPrograms;

import java.util.Scanner;

public class CountPunctuation {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a String which contains Punctuation...");
	String str=scanner.nextLine();
	int count=0;
	for(int i=0;i<=str.length()-1;i++) {
	if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='\''||str.charAt(i)=='/'||str.charAt(i)=='?'||str.charAt(i)==':'){
	
		count++;
	
	}}
	System.out.println(count);
}
}
