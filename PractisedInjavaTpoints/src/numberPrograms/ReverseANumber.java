package numberPrograms;

import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scanner.nextInt();
	int revNum=0;
	while(n!=0) {
	   int rem=n%10;
	   revNum=rem+revNum*10;
	   n=n/10;
	}
	System.out.println(revNum);
}
}
