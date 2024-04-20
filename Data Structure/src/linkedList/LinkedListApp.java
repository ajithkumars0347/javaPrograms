package linkedList;

import java.util.Scanner;

public class LinkedListApp {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    LinkedListImplementation ll = new LinkedListImplementation();
    while(true) {
    	System.out.println("press 1....insert at rear");
    	System.out.println("press 2....insert at front");
    	System.out.println("press 3....delete at rear");
    	System.out.println("press 4....delete at front");
    	System.out.println("press 5....display");
    	System.out.println("press 6....insert at position");
    	System.out.println("press 7....delete at position");
    	System.out.println("enter your choice");
        int choice = scan.nextInt();
        switch(choice) {
        case 1:
        	ll.insertRear();
        	break;
        case 2:
        	ll.insertFront();
        	break;
        case 3:
        	ll.deleteRear();
        	break;
        case 4:
        	ll.deleteFront();
        	break;
        case 5:
        	ll.display();
        	break;
        case 6:
        	ll.insertAtPosition();
        	break;
        case 7:
        	ll.deleteAtPosition();
        	break;
        default:
              System.exit(0);
        }
    }
}
}
