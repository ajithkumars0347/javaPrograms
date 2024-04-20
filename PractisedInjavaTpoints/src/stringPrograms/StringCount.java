package stringPrograms;

import java.util.Scanner;

public class StringCount {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String");
	String str=scanner.nextLine();
	int count=0;
	for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)!=' ') {
			count++;
		}
	}
System.out.println("total number of character is.."+count);
}

}
