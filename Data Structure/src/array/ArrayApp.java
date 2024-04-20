package array;

import java.util.Scanner;

public class ArrayApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array size...");
	int size=scan.nextInt();
	ArrayImplementation arrImp=new ArrayImplementation(size);
	
	while(true) {
		System.out.println("press 1 ....inserting");
		System.out.println("press 2 ....deleting");
		System.out.println("press 3 ....displaying");
		System.out.println("press anything  ....exit");
		System.out.println("enter your choice...");
		
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			arrImp.insert();
			break;
		case 2:
			arrImp.delete();
			break;
		case 3:
			arrImp.display();
			break;
		default:
			System.exit(0);
		}
	}
}
}
