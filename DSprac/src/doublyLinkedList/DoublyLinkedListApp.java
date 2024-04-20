package doublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListApp {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 DoublyListImplementation dbl=new DoublyListImplementation();
	while(true) {
		System.out.println("enter 1...insert at first");
		System.out.println("enter 2...insert at last");
		System.out.println("enter 3...insert at position");
		System.out.println("enter 4...display forward");
		System.out.println("enter 5...display backward");
		System.out.println("enter other...exit");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			dbl.insertAtFirst();
			break;
		case 2:
			dbl.insertAtLast();
			break;
		case 3:
			dbl.insertAtPostion();
			break;
		case 4:
			dbl.displayForward();
			break;
		case 5:
			dbl.displayBackWard();
			break;
		default:
			System.exit(0);
		}
	}
}
}
