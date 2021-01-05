package package2;

import java.util.Scanner;

class Reverse

{

	node head = null;

	class node

	{

		int data;

		node next;

		node(int data1)

		{

			data = data1;

			next = null;

		}

	}

	void put(int data)

	{

		node n1 = new node(data);

		n1.next = head;

		head = n1;

	}

	void print()

	{

		node curr = head;

		node top = null;

		node temp = head;

		while (temp != null)

		{

			temp = curr.next;

			curr.next = top;

			top = curr;

			curr = temp;

		}

		while (top != null)

		{

			System.out.println(top.data);

			top = top.next;

		}

	}

public static void main(String args[])

	{

		Reverse s=new Reverse();

		Scanner scan=new Scanner(System.in);

		System.out.print("enter the value of n");

		int n = scan.nextInt();

		System.out.print("enter the values");

		for(int i =0;i<n;i++)

		{

			s.put(scan.nextInt());

		}

		s.print();

	}

}