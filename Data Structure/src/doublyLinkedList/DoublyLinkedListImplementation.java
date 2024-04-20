package doublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListImplementation {

	public class Node {
		Node prevLink;
		int data;
		Node nextLink;
	}
     Scanner scan=new Scanner(System.in);
     Node first;
     
	public void insertAtFirst() {
		Node newNode=new Node();
	System.out.println("enter the element");
	int elem=scan.nextInt();
	newNode.data=elem;
	newNode.prevLink=null;
	newNode.nextLink=null;
	if(first==null) {
		first=newNode;
	}
	else {
	    newNode.nextLink=first;
		newNode.prevLink=null;
        first=newNode;
	}
	}
	
	public void insertAtRear() {
		System.out.println("enter the element");
		int elem= scan.nextInt();
		Node newNode=new Node();
		newNode.prevLink=null;
		newNode.data=elem;
		newNode.nextLink=null;
		Node temp=first;
		if(first==null) {
			first=newNode;
		}
		else {
			while(temp.nextLink!=null) {
				temp=temp.nextLink;
			}
			newNode.nextLink=null;
			temp.nextLink=newNode;
			newNode.prevLink=temp;
		}
	}
	public void displayForward() {
		if(first==null) {
			System.out.println("Display Not possible");
		}
		else {
			Node temp=first;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp=temp.nextLink;
			}
		}
	}
	
	public void displayBackward() {
		if(first==null) {
			System.out.println("display not possible");
		}
		else if(first.nextLink==null){
			System.out.println(first.data);
		}
		else {
			Node temp=first;
			while(temp.nextLink!=null) {
				temp=temp.nextLink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prevLink;
			}
		}
	}
	
	public void deleteAtFront() {
		if(first==null) {
			System.out.println("deletion is not possible");
		}
		else if(first.nextLink==null){
			first=null;
		}
		else {
			first.nextLink.prevLink=null;
			first=first.nextLink;
		}
	}
	public void deleteAtRear() {
		if(first==null) {
			System.out.println("deletion is not possible");
		}
		else if(first.nextLink==null){
			first=null;
		}
		else {
			Node temp=first;
			while(temp.nextLink.nextLink!=null) {
				temp=temp.nextLink;
			}
			temp.nextLink=null;
		}
	}
	
	public void insertAtPosition() {
		
	    
	    if(first==null) {
	    	insertAtFirst();
	    }
	    else {
	    	System.out.println("enter the element");
		    int elem=scan.nextInt();
		    System.out.println("enter the position");
		    int pos=scan.nextInt();
		    Node newNode=new Node();
		    newNode.data=elem;
		    Node temp=first;
		    int count=1;
		    while(count!=pos-1) {
		    	temp=temp.nextLink;
		    	++count;
		    }
		    if(temp.nextLink==null) {
		    	newNode.prevLink=temp;
			    newNode.nextLink=null;
			    temp.nextLink=newNode;
		    }
		    else {
		    	newNode.prevLink=temp;
			    newNode.nextLink=temp.nextLink;
			    temp.nextLink=newNode;	
		    }
		    
	    }
	}
	
	public void deleteAtPostion() {
		if(first==null) {
			System.out.println("deletion not possible");
		}
		else if(first.nextLink==null) {
			first=null;
		}
		else {
		System.out.println("enter the position to delete");
		int pos=scan.nextInt();
		Node temp=first;
		int count=1;
		while(count!=pos-1) {
			temp=temp.nextLink;
			++count;
		}
		if(temp.nextLink.nextLink==null) {
			System.out.println("deleted element is "+temp.nextLink.data);
			temp.nextLink=null;
		}
		else {
		System.out.println("deleted element is "+temp.nextLink.data);
		temp.nextLink.nextLink.prevLink=temp;
		temp.nextLink=temp.nextLink.nextLink;
		}
		}
	}
}
