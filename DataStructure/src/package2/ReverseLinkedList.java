package package2;
/*
 * Reversed LinkedList Implementation
 */

import java.util.Scanner;

public class ReverseLinkedList {

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
	
	ReverseLinkedList()
	{
		ReverseLinkedList.root=null;
	}
	
	
	
	public void insert(int e)
	{
		Node n=new Node(e);
		if(ReverseLinkedList.root==null)
			ReverseLinkedList.root=n;
		else
		{
			Node t=ReverseLinkedList.root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
	}
	
	public void printLinkedList()
	{
		if(ReverseLinkedList.root==null)
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
	
	public void getReverseLinkedList()
	{
		stack s = new stack(10);
		Node t=root;
		while(t!=null)
		{
			s.push(t.data);
			t=t.next;
		}
		
		while(!s.isEmpty())
		{
			
			System.out.println(s.pop());
		}
		
	}
	
	public static void main(String[] args) {
		ReverseLinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new ReverseLinkedList();
		do
		{
			System.out.println("\n<--LinkedList-->\n1.insert\n2.printLinkedList\n3.getReverseLinkedList\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter the element : ");
					n=in.nextInt();
					obj.insert(n);
					break;
			case 2:
					obj.printLinkedList();
					break;
			case 3:
					obj.getReverseLinkedList();
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




















