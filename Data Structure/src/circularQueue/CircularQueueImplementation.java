package circularQueue;

import java.util.Scanner;

public class CircularQueueImplementation {
private int cq[];
private int front=0;
private int rear=-1;
private int cqSize;
private int count=0;
private Scanner scan=new Scanner(System.in);
public CircularQueueImplementation(int size) {
	cq=new int[size];
	cqSize=cq.length-1;
}

public void insert() {
if(count==cqSize) {
	System.out.println("insertion not possible...");
}
else {
	System.out.println("enter an element");
	int elem=scan.nextInt();
	rear=(rear+1)%cqSize;
	cq[rear]=elem;
	count++;
}
}
public void delete() {
	if(count==0) {
		System.out.println("deletion is not possible...");
	}
	else {
		System.out.println("deleted element is "+cq[front]);
		front++;
		count--;
	}
}
public void display() {
	int frontLine=front;
	if(count==0) {
		System.out.println("display not possible...");
	}
	else {
		for(int i=1;i<=count;i++) {
			System.out.print(cq[frontLine]+" ");
			frontLine++;
		}
	}
}
}
