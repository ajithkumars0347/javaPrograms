package stack;

import java.util.Scanner;

public class StackImplementation {
	private int stackArr[];
	private int top=-1;
	Scanner scan=new Scanner(System.in);
	public StackImplementation(int size) {
		stackArr=new int[size];
	}

	public void push() {
		if(top==stackArr.length-1) {
			System.out.println("push is not possible...");
		}
		else {
			++top;
			System.out.println("enter the element");
			int elem=scan.nextInt();
			stackArr[top]=elem;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("pop is not possible");
		}
		else {
		    System.out.println("poped element is "+ stackArr[top]);
		    --top;
		}
		
	}
	
	public void display() {
	  for(int i=0;i<=top;i++) {
		  System.out.print(stackArr[i]+" ");
	  }
	}
}
