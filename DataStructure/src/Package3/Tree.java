/*
 *      Tree Implementation
 */
package Package3;

import java.util.Scanner;

class Node 
{
	int key;
	Node left,right;
	Node(int e)
	{
		key=e;
		left=right=null;
	}
}

public class Tree {
	
	Node root;
	Tree()
	{
		root=null;
	}
	
	public void insert(Node r,Node n)
	{
		if(root==null)
			root=n;
		else
		{
			if(n.key<r.key)
			{
				if(r.left==null)
					r.left=n;
				else
					insert(r.left,n);
			}
			else
			{
				if(r.right==null)
					r.right=n;
				else
					insert(r.right,n);
			}
		}
	}
	
	public void inorder(Node r)
	{
		if(r!=null)
		{
			inorder(r.left);
			System.out.println(r.key);
			inorder(r.right);
		}
	}
	
	public void preorder(Node r)
	{
		if(r!=null)
		{
			System.out.println(r.key);
			preorder(r.left);
			preorder(r.right);
		}
	}
	
	public void postorder(Node r)
	{
		if(r!=null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.println(r.key);	
		}
	}

	public static void main(String[] args) {
		

		int ch;
		Scanner in=new Scanner(System.in);
		Tree t =new Tree();
		do
		{
			System.out.println("\n1.insert\n2.inorder\n3.preorder\n4.postorder\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Element : ");
				int x=in.nextInt();
				Node n1=new Node(x);
				t.insert(t.root, n1);
				break;
			case 2:
				t.inorder(t.root);
				break;
			case 3:
				t.preorder(t.root);
				break;
			case 4:
				t.postorder(t.root);
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























