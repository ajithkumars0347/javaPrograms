package linkedList;

import java.util.Scanner;

public class LinkedListImplementation {

	public class Node{
		int data;
		Node link;
	}

	private Node first;
	Scanner scan=new Scanner(System.in);
	
	
	public void insertRear(){
		System.out.println("enter the element...");
		int elem=scan.nextInt();
		Node newNode=new Node();
		Node temp;
		if(first==null) {
			newNode.data=elem;
			newNode.link=null;
			first=newNode;
		}
		else {
			temp=first;
           while(temp.link!=null) {
        	   temp=temp.link;
           }
           temp.link=newNode;
           newNode.data=elem;
           newNode.link=null;
		}
	}
	
	public void deleteRear() {
		if(first==null) {
			System.out.println("deletion not possible...");
		}
		else if(first.link==null) {
			System.out.println("deleted element is "+first.data);
			first=null;
		}
		else {
			Node temp=first;
			while(temp.link.link!=null) {
				temp=temp.link;
			}
			System.out.println("deleted element is "+temp.link.data);
			temp.link=null;
		}
	}
	
	public void insertFront() {
		System.out.println("enter the element...");
       int elem=scan.nextInt();
       Node newNode=new Node();
		if(first==null) {
		newNode.data=elem;
		newNode.link=null;
		first=newNode;
		}
		else {
			newNode.data=elem;
			newNode.link=first;
			first=newNode;
		}
	}
	
	public void deleteFront() {
	   if(first==null) {
		   System.out.println("deletion is not possible...");
	   }
	   else if(first.link==null) {
	   System.out.println("deleted element is "+first.data);
	   first=null;
	   }
	   else {
		   System.out.println("deleted element is "+first.data);
		   first=first.link;
	   }
	}
	
	public void display() {
		if(first==null) {
			System.out.println("display not possible...");
		}
		else if(first.link==null) {
			System.out.println(first.data);
		}
		else {
			Node temp=first; 
			while(temp!=null) {
				System.out.print(temp.data);
				temp=temp.link;
			}
			System.out.println();
		}
	}
	
	public void insertAtPosition() {
		
		Node newNode=new Node();
		if(first==null) {
			insertFront();
		}
		else {
			System.out.println("enter the element");
			int elem=scan.nextInt();
			newNode.data=elem;
			System.out.println("enter the position");
			int pos=scan.nextInt();
		int count=1;
		Node temp=first;
		while(count!=pos-1) {
			temp=temp.link;
			++count;
		}
		newNode.link=temp.link;
		temp.link=newNode;
		}
	}
	
	public void deleteAtPosition() {
		if(first==null) {
			System.out.println("deletion not possible");
		}
		else {
			System.out.println("enter the position to delete");
		    int pos=scan.nextInt();
		    Node temp=first;
		    int count=1;
		    if(pos==1) {
		    	deleteFront();
		    }
		    else {
		    while(count!=pos-1) {
		    	temp=temp.link;
		    	++count;
		    }
		    }
		    if(temp.link.link==null) {
		    	temp.link=null;
		    }
		    else {
		    	temp.link=temp.link.link;
		    }
		}
	}
}
