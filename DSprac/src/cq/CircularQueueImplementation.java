package cq;
import java.util.*;
public class CircularQueueImplementation {
int cq[];
int front=0;
int rear=-1;
private int size;
int count=0;
Scanner scan=new Scanner(System.in);
public CircularQueueImplementation(int size) {
	cq=new int[size];
	this.size=cq.length-1;
}

public void insert() {
	if(count==size) {
		System.out.println(size);
		System.out.println("insertion not possible");
	}
	else {
		System.out.println("enter the element");
		int elem=scan.nextInt();
		rear=(rear+1)%size;
		cq[rear]=elem;
		++count;
	}
}
public void delete() {
	if(count==0) {
		System.out.println("deletion not possible");
	}
	else {
		System.out.println("deleted element is "+cq[front]);
		cq[front]=0;
		front=(front+1)%size;
		--count;
	}
}

public void display() {
	if(count==0) {
		System.out.println("display not possible");
	}
	else {
		for(int i=front;i<count;i++) {
			System.out.print(cq[i]+" ");
		}
			}
}

}
