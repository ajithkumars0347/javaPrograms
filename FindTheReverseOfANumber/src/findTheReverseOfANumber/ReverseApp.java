package findTheReverseOfANumber;

import java.util.Scanner;

public class ReverseApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to find the reverse of the number");
        int n = scan.nextInt();
        Reverse reverse=new Reverse();
        int res =reverse.reverseMethod(n); 
        System.out.println("reverse of " + n + " is " + res);
        if(n==res) {
        	System.out.println("given number is palidrome");
        }
        	else {
            	System.out.println("given number  is not palidrome");
        	}
        }
    }
    
