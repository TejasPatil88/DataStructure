/*
 * Stack Using LinkedList/Dynamic Stack
 */
package package1;

import java.util.Scanner;

public class StackLinkedList {

	Node tos;
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	StackLinkedList()
	{
		tos=null;
	}
	
	public void push(int e)
	{
		Node n= new Node(e);
		if(tos==null)
			tos=n;
		else
		{
			n.next=tos;
			tos=n;
		}
	}
	
	public void pop()
	{
		if(tos==null)
			System.out.println("Empty StackLinkedList");
		else
		{
			Node t=tos;
			tos=tos.next;
			System.out.println(t.data+" Poped");
		}
	}
	
	public void printStack()
	{
		if(tos==null)
			System.out.println("Empty StackLinkedList");
		else
		for(Node t=tos;t!=null;t=t.next)
			System.out.print(t.data+" | ");
	}
	
	public static void main(String[] args) {
		StackLinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new StackLinkedList();
		do
		{
			System.out.println("\n<--StackLinkedList-->\n1.Push\n2.Pop\n3.print\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter Elements : ");
					n=in.nextInt();
					obj.push(n);
					break;
			case 2:
					obj.pop();
					break;
			case 3:
				obj.printStack();
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



















