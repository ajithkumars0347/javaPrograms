package queue;

import java.util.Scanner;

public class QueueApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of the queue");
	int size=scan.nextInt();
	QueueImplementation q=new QueueImplementation(size);
	
	while(true) {
		System.out.println("press 1...insertion");
		System.out.println("press 2...deletion");
		System.out.println("press 3...display");
		System.out.println("press any other number...exit");
		System.out.println("enter your choice");
      int choice=scan.nextInt();
		switch(choice) {
		case 1:
			q.insert();
			break;
		case 2:
			q.deletion();
			break;
		case 3:
			q.display();
			break;
	    default:
	    	System.exit(0);
  }

	}
}
}
