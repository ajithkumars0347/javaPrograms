package simplePrograms;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter one from below option");
	System.out.println("enter A for giving divisible by two");
	System.out.println("enter B for giving divisible by three");
	System.out.println("enter C for giving divisible by five");
	System.out.println("enter D for giving divisible by Two and five");
	System.out.println("enter E for giving divisible by three and five");
	System.out.println("enter P for giving prime numbers");
	System.out.println("enter Q for giving divisible by 3 as well as even");
	System.out.println("enter R for giving divisible by 5 as well as odd");
	char opt=scan.nextLine().charAt(0);
	switch(opt) {
	case 'A':
	Solution1 byTwo=new Solution1();
	byTwo.divisibleByTwo();
	break;
	case 'B':
		Solution2 byThree=new Solution2();
	    byThree.divisibleByThree();
	    break;
	case 'C':
		Solution3 byFive=new Solution3();
	    byFive.divisibleByFive();
	    break;
	case 'D':
		Solution4 byTwoAndFive=new Solution4();
		byTwoAndFive.divisibleBy2And5();
	    break;
	case 'E':
		Solution5 byThreeAndFive=new Solution5();
		byThreeAndFive.divisibleBy3And5();
	    break;
	case 'P':
		Solution6 prime=new Solution6();
		prime.range();
	    break;
	case 'Q':
		Solution7 by3even=new Solution7();
		by3even.divisibleBy3even();
	case 'R':
		Solution8 by=new Solution8();
		by.divisibleBy5andOdd();
}
	}
}
