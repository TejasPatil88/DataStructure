package package2;
/*
 *   LinkedList Sorting Implementation
 */

import java.util.Scanner;

public class SortLinkedList {

	static Node root;
	private int size;
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	SortLinkedList()
	{
		SortLinkedList.root=null;
		this.size=0;
	}
	
	public void sortLinkedList() 
	{
        if (size > 1) 
        {
            for (Node t=root,t2=root.next;t!=null && t2!=null;t=t.next,t2=t2.next)
            {
                if(t.data>t2.data)
                {
                	int temp=t.data;
                	t.data=t2.data;
                	t2.data=temp;
                	System.out.println(t.data);
                }
            }
        }
    }
	
	public void insert(int e)
	{
		Node n=new Node(e);
		if(SortLinkedList.root==null)
			SortLinkedList.root=n;
		else
		{
			Node t=SortLinkedList.root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
		size++;
	}
	
	public void printLinkedList()
	{
		if(SortLinkedList.root==null)
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
	
	public void delete()
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
	
	
	public static void main(String[] args) {
		SortLinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new SortLinkedList();
		do
		{
			System.out.println("\n<--LinkedList-->\n1.insert\n2.printLinkedList\n3.delete\n4.sortLinkedList\n0.Exit\n");
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
					obj.delete();
					break;
			case 4:
					obj.sortLinkedList(); 
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




















