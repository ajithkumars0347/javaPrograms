package stringPrograms;

import java.nio.charset.Charset;
import java.util.Scanner;

public class ReplaceLowerCaseToUpperCase {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a String which should contain both low and upper case letter..");
    String str=scanner.nextLine();
    StringBuffer strb=new StringBuffer(str);
    for(int i=0;i<=str.length()-1;i++) {
      if(Character.isLowerCase(str.charAt(i))) {
    	  strb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
      }
      else if(Character.isUpperCase(str.charAt(i))) {
    	  strb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
      }
    }
    System.out.println(strb);
}
}
