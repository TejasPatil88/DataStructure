/*
 *  LinkedList Implementation
 */

import java.util.Scanner;

public class LinkedList {

	static Node root;
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	LinkedList()
	{
		LinkedList.root=null;
	}
	
	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(LinkedList.root==null)
			LinkedList.root=n;
		else
		{
			n.next=LinkedList.root;
			LinkedList.root=n;
		}
	}
	
	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(LinkedList.root==null)
			LinkedList.root=n;
		else
		{
			Node t=LinkedList.root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
	}
	
	public void printLinkedList()
	{
		if(LinkedList.root==null)
			System.out.println(" Empty LinkedList ");
		else
		{
			Node t=root;
			while(t!=null)
			{
				System.out.print(t.data+" | ");
				t=t.next;
			}
		}
	}
	
	public boolean Search(int key)
	{
		if(root==null)
			System.out.println("Empty LinkedList");
		else
		{
			Node t=root;
			while(t!=null)
			{
				if(t.data==key)
					return(true);
				t=t.next;
			}
		}
		return false;
	}
	
	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty LinkedList ");
		else
		{
			Node t=root;
			root=root.next;
			System.out.println(t.data+" deleted");
		}
	}
	
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty LinkedList");
		else
		{
			Node t=root;
			Node t2=t;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			t2.next=null;
			System.out.println(t.data+" deleted");
		}
	}
	
	public void deleteKey(int key)
	{
		if(root==null)
			System.out.println("Empty LinkedList  ");
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=null && t.data!=key)
			{
				t2=t;
				t=t.next;
			}
			if(t==null)
				System.out.println(" Element Not Found ");
			else
			{
				if(t==root)
				{
					root=root.next;
				}
				else if(t.next==root)
				{
					t2.next=null;
				}
				else
				{
					t2.next=t.next;
				}
				System.out.println(t.data+" deleted");
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new LinkedList();
		do
		{
			System.out.println("\n<--LinkedList-->\n1.insertLeft\n2.insertRight\n3.printLinkedList\n4.Search\n5.deleteLeft"
					+ "\n6.deleteRight\n7.deleteKey\n0.Exit\n");
			ch=in.nextInt();
			boolean Res;
			switch(ch)
			{
			case 1:
					System.out.println("Enter the element : ");
					n=in.nextInt();
					obj.insertLeft(n);
					break;
			case 2:
					System.out.println("Enter the element : ");
					n=in.nextInt();
					obj.insertRight(n);
					break;
			case 3:
					obj.printLinkedList();
					break;
			case 4:
				System.out.println("Enter the element to be search : ");
				n=in.nextInt();
				Res=obj.Search(n);
				if(Res)
				    System.out.println("Element found ");
				else
				{
					System.out.println("Element not found");
				}
				break;
			case 5:
				obj.deleteLeft();
				break;
			case 6:
				obj.deleteRight();
				break;
			case 7:
				System.out.println("Enter the Element to be deleted : ");
				n=in.nextInt();
				obj.deleteKey(n);
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




















