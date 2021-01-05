/*
 * DoublyLinkedLists Implementation
 */
package package1;

import java.util.Scanner;
	
public class DoublyLinkedList {
	
	 Node root,last;
	 class Node {
		int data;
		Node right;
		Node left;
		Node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	DoublyLinkedList()
		{
			root=last=null;
		}
	public void insertLeft(int e)
	{
		Node n = new Node(e);
		if(root==null)
		{
			root=last=n;
		}
		else
		{
			root.left=n;
			n.right=root;
			root=n;
		}
	}
	
	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty DoublyLinkedList");
		else
		{
			Node t = root;
			root=root.right;

			System.out.println(t.data+" deleted");
		}
	}
	
	public void insertRight(int e)
	{
		Node n = new Node(e);
		if(root==null)
		{
			root=last=n;
		}
		else
		{
			last.right=n;
			n.left=last;
			last=n;
		}
	}
	
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty DoublyLinkedList");
		else
		{
			Node t = last;
			if(t.left!=null )
			{
				last = last.left;
				last.right = null;
				System.out.println(t.data + " Removed");
			}
			else
			{
				System.out.println(t.data + " Removed");
				root=last=null;
			}

		}
	}
	
	public void printfromLeftToRight()
	{
		if(root==null)
			System.out.println("Empty DoublyLinkedList");
		else
		{
			Node t = root;
			while(t!=null)
			{
				System.out.print(t.data+" | ");
				t=t.right;
			}
		}
	}
	
	public void printfromRightToLeft()
	{
		if(root==null)
			System.out.println("Empty DoublyLinkedList");
		else
		{
			Node t = last;
			while(t!=null)
			{
				System.out.print(t.data+" | ");
				t=t.left;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		DoublyLinkedList obj=null;
		int ch,n;
		Scanner in=new Scanner(System.in);
		obj=new DoublyLinkedList();
		do
		{
			System.out.println("\n<--DoublyLinkedList-->\n1.insertLeft\n2.insertRight\n3.printfromLeftToRight"
					+ "\n4.printfromRightToLeft\n5.deleteLeft"
					+ "\n6.deleteRight\n0.Exit\n");
			ch=in.nextInt();
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
					obj.printfromLeftToRight();
					break;
			case 4:
					obj.printfromRightToLeft();
					break;
			case 5:
					obj.deleteLeft();
					break;
			case 6:
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


























