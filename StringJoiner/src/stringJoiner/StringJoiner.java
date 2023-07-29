package stringJoiner;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
   System.out.println(joinStrings(str1,str2));
	}
	public static String joinStrings(String str1, String str2) 
	{
		return str1+str2;	
	}
}
