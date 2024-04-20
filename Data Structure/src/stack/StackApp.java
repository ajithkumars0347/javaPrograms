package stack;

import java.util.Scanner;

public class StackApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of the stack");
	int size=scan.nextInt();
	StackImplementation s=new StackImplementation(size);
	
	while(true) {
		System.out.println("press 1 ....push");
		System.out.println("press 2 ....pop");
		System.out.println("press 3 ....display");
		System.out.println("press other ....exit");
		System.out.println("enter your choice");
		
		int choice=scan.nextInt();
		switch(choice) {
		
		case 1:
			s.push();
			break;
		case 2:
			s.pop();
			break;
		case 3:
			s.display();
			break;
	    default:
	    	System.exit(0);
		}
	}
}
}
