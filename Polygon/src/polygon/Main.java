package polygon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number between 3 to 6");
		int num=scan.nextInt();
		identifyPolygon(num);

	}
public static void identifyPolygon(int num) {
	switch(num) {
	case 3:System.out.println("it is a triangle");
	break;
	case 4:System.out.println("it is a quadrilateral");
	break;
	case 5:System.out.println("it is a pentagon");
	break;
	case 6:System.out.println("it is a hexagon");
	break;
	default:System.out.println("please,enter the valid number between 3 to 6");
	break;
	}
}
}
