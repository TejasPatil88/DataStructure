/*
 * CircularLinkedList
 */
package package1;

import java.util.Scanner;

public class CircularLinkedList {
	
	static Node root;
	Node last;
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	CircularLinkedList()
	{
		CircularLinkedList.root=null;
	}
	
	public void insertLeft(int e)
	{
		Node n = new Node(e);
		if(root==null) 
		{
			root=last=n;
			last.next=root;
		}
		else
		{
			n.next=root;
			root=n;
			last.next=root;
		}
	}

	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty CircularLinkedList");	
		else
		{
			Node t=root;
			root=root.next;
			last.next=root;
			System.out.println(t.data+" removed");
		}
	}
	
	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next=root;
		}
		else
		{
			last.next=n;
			last=n;
			last.next=root;
		}
	}
	
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty CircularLinkedList");
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=last)
			{
				t2=t;
				t=t.next;
			}
			last=t2;
			last.next=root;
			System.out.println(t.data+" Removed");
		}
	}
	
	public void printCircularLinkedList()
	{
		if(root==null)
			System.out.println("Empty CircularLinkedList");
		else
		{
			Node t=root;
			do
			{
				System.out.print(t.data+" | ");
				t=t.next;
			} 
			while(t!=root);
		}
	}
	
	public static void main(String[] args) {
		
		CircularLinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new CircularLinkedList();
		do
		{
			System.out.println("\n<--CircularLinkedList-->\n1.insertLeft\n2.insertRight\n3.printCircularLinkedList"
					+ "\n4.deleteLeft\n5.deleteRight\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter Elements : ");
					n=in.nextInt();
					obj.insertLeft(n);
					break;
			case 2:
				System.out.println("Enter Elements : ");
				n=in.nextInt();
				obj.insertRight(n);
					break;
			case 3:
				obj.printCircularLinkedList();
				break;
			case 4:
				obj.deleteLeft();
				break;
			case 5:
				obj.deleteRight();
				break;
			case 0:
				System.out.println("\nExiting");
				break;
			default:
				System.out.println("Wrong option");
				break;
			}
		}
		while(ch!=0);
	}
}




















