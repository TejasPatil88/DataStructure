/*
 * Queue Using LinkedList/Dynamic Queue
 */
package package1;

import java.util.Scanner;

public class QueueLinkedList {

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node Rear,Front;
	
	QueueLinkedList()
	{
		Rear=Front=null;
	}
	
	public void Enqueue(int e)
	{
		Node n=new Node(e);
		if(Front==null)
		{
			Front=Rear=n;
		}
		else
		{
			Rear.next=n;
			Rear=n;
		}
	}
	
	public void Dequeue()
	{
		if(Front==null)
			System.out.println("Empty Queue");
		else
		{
			Node t=Front;
			Front=Front.next;
			System.out.println(t.data+" Dequeued");
		}
	}
	
	public void printQueue()
	{
		if(Front==null)
			System.out.println("Empty Queue");
		else
		for(Node t=Front;t!=null;t=t.next)
			System.out.print(t.data+" | ");
	}
	
	public static void main(String[] args) {
		
		QueueLinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new QueueLinkedList();
		do
		{
			System.out.println("\n<--QueueLinkedList-->\n1.Enqueue\n2.Dequeue\n3.printQueue\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter Elements : ");
					n=in.nextInt();
					obj.Enqueue(n);
					break;
			case 2:
					obj.Dequeue();
					break;
			case 3:
				obj.printQueue();
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
















