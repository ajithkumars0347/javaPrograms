package queue;

import java.util.Scanner;

public class QueueImplementation {
 private int queueArr[];
 private int front=0;
 private int rear=-1;
 private Scanner scan=new Scanner(System.in);
 public QueueImplementation(int size) {
	 queueArr=new int[size];
 }
public void insert() {
	if(rear==queueArr.length-1) {
		System.out.println("insertion is not possible...");
	}
	else {
       System.out.println("enter the element");
       int elem=scan.nextInt();
       ++rear;
       queueArr[rear]=elem;
	}
}
public void deletion() {
	if(rear==-1 || front>rear) {
		System.out.println("deletion is not possible");
	}
	else {
		System.out.println("deleted element is "+queueArr[front]);
		++front;
	}
}
public void display() {
	if(rear==-1 || front>rear) {
		System.out.println("display is not possible");
	}
	else {
		for(int i=front;i<=rear;i++) {
			System.out.print(queueArr[i]+" ");
		}
	}
}
}
