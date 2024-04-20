package doublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	DoublyLinkedListImplementation dll=new DoublyLinkedListImplementation();
   while(true) {
	   System.out.println("enter 1---> insert at front");
	   System.out.println("enter 2---> insert at rear");
	   System.out.println("enter 3--> display in forward ");
	   System.out.println("enter 4--> delete at front");
	   System.out.println("enter 5--> delete at rear");
	   System.out.println("enter 6--> insert at position");
	   System.out.println("enter 7-->delete at position");
	   System.out.println("enter others--->stop");
	   System.out.println("enter your choice");
     int choice=scan.nextInt();
	   switch(choice) {
	   case 1:
		   dll.insertAtFirst();
		   break;
	   case 2:
		   dll.insertAtRear();
		   break;
	   case 3:
		   dll.displayForward();
		   break;
	   case 4:
		   dll.deleteAtFront();
		   break;
	   case 5:
		   dll.deleteAtRear();
		   break;
	   case 6:
		   dll.insertAtPosition();
		   break;
	   case 7:
		   dll.deleteAtPostion();
		   break;
	   case 8:
		   dll.displayBackward();
		   break;
	default:
		   System.exit(0);
	   }
   }
}
}
