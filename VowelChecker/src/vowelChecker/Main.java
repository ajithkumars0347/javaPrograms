package vowelChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.nextLine().charAt(0);
		characterChecker(ch);
	}
   public static void characterChecker(char ch) {
	   if(Character.isDigit(ch)) {
		   System.out.println("entered character "+ch+" is Digit");
	   }
	   else if(!Character.isLetter(ch)) { //Character.isLetter(ch)==false (both are correct)
              System.out.println("entered Character "+ch+" is special character");		   
	   }
	   else {
		   switch(Character.toLowerCase(ch)) {
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
			      if(Character.isLowerCase(ch)) {
			    	  System.out.println("entered character "+ch+" is lowerCase vowel");
				     }
			      else {
			    	  System.out.println("entered character "+ch+" is upperCase vowel");
			      }
			      break;
			      default:
			    	  if(Character.isLowerCase(ch)) {
			    		  System.out.println("entered character "+ch+" is lowerCase consonent");
			    	  }
			    	  else {
			    		  System.out.println("entered character "+ch+" is upperCase consonent");
			    	  }
		   }
		   }
   }
}
