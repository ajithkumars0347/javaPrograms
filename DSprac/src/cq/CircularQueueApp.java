package cq;
import java.util.Scanner;

public class CircularQueueApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of queue");
	int size=scan.nextInt();
	CircularQueueImplementation cqi=new CircularQueueImplementation(size);
	while(true) {
		System.out.println("enter 1...insertion");
		System.out.println("enter 2...deletion");
		System.out.println("enter 3...display");
		System.out.println("enter other...exit");
		System.out.println("enter your choice");
    
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
         cqi.insert();
         break;
		case 2:
			cqi.delete();
			break;
		case 3:
			cqi.display();
			break;
	    default:
	    	System.exit(0);
		}
	}
}
}
