package doublyLinkedList;

import java.util.Scanner;

public class DoublyListImplementation {
public class Node {
	Node preLink;
	int data;
	Node nextLink;
}
Node first;
Scanner scan=new Scanner(System.in);

public void insertAtFirst() {
	System.out.println("enter the element");
	int elem=scan.nextInt();
	Node newNode=new Node();
	newNode.preLink=null;
	newNode.data=elem;
	newNode.nextLink=null;
	
	if(first==null) {
	  first=newNode;
	}
	else {
		first.preLink=newNode;
		newNode.nextLink=first;
		first=newNode;
	}
}

public void insertAtLast() {
	System.out.println("enter the element");
	int elem=scan.nextInt();
	Node newNode=new Node();
	newNode.preLink=null;
	newNode.data=elem;
	newNode.nextLink=null;
	
	if(first==null) {
	  first=newNode;
	}
	Node temp=first;
	
	while(temp.nextLink!=null) {
		temp=temp.nextLink;
	}
	temp.nextLink=newNode;
	newNode.preLink=temp;
	
}
public void insertAtPostion() {
	System.out.println("enter the element");
	int elem=scan.nextInt();
	System.out.println("enter the position");
	int pos=scan.nextInt();
	Node newNode=new Node();
	newNode.data=elem;
	int count=1;
	Node temp=first;
	while(count!=pos-1) {
		temp=temp.nextLink;
		count++;
	}
	newNode.nextLink=temp.nextLink;
	temp.nextLink=newNode;
	newNode.preLink=temp;
}

public void displayForward() {
	Node temp=first;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.nextLink;
	}
}
public void displayBackWard() {
	Node temp=first;
	while(temp.nextLink!=null) {
		temp=temp.nextLink;
	}
	while(temp!=null) {
		System.out.print(temp.data+" ");
	    temp=temp.preLink;
	}
}
}
