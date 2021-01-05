/*
 * MergeLinkedList Implementation
 */
package package2;

public class MergeLinkedList {
	
	static Node_1 root_1;
	class Node_1 {
		int data;
		Node_1 next;
		Node_1(int d)
		{
			data=d;
			next=null;
		}
	}

	static Node_2 root_2;
	class Node_2 {
		int data;
		Node_2 next;
		Node_2(int d)
		{
			data=d;
			next=null;
		}
	}
	
	static Node_3 root_3;
	class Node_3 {
		int data;
		Node_3 next;
		Node_3(int d)
		{
			data=d;
			next=null;
		}
	}
	
	MergeLinkedList()
	{
		MergeLinkedList.root_1=null;
		MergeLinkedList.root_2=null;
		MergeLinkedList.root_3=null;
	}
	
	public void insert_1(int e)
	{
		Node_1 n=new Node_1(e);
		if(MergeLinkedList.root_1==null)
			MergeLinkedList.root_1=n;
		else
		{
			Node_1 t=MergeLinkedList.root_1;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
	}
	
	public void insert_2(int e)
	{
		Node_2 n=new Node_2(e);
		if(MergeLinkedList.root_2==null)
			MergeLinkedList.root_2=n;
		else
		{
			Node_2 t=MergeLinkedList.root_2;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
	}
	
	public void printLinkedList()
	{
		
		if(MergeLinkedList.root_3==null)
			System.out.println(" Empty LinkedList ");
		else
		{
			Node_3 t=root_3;
			while(t!=null)
			{
				System.out.print(t.data+" | ");
				t=t.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		MergeLinkedList obj = new MergeLinkedList();
		obj.insert_1(10);
		obj.insert_2(7);
		obj.insert_2(8);
		 	Node_1 newnodeA1 = null;
			Node_1 root_1=newnodeA1;        
	        Node_2 newnodeB1 = null;
			Node_2 root_2=newnodeB1;
	        Node_3 newnodeC1 = null;
			Node_3 root_3=newnodeC1;
		while(root_3.next!=null)
		{
				if(root_1.data>root_2.data)     
	            {
	                root_3.data=root_2.data;
	                root_2=root_2.next;
	                root_3=root_3.next;
	                
	            }
	            else if(root_1.data<root_2.data)
	            {
	                root_3.data=root_1.data;
	                root_1=root_1.next;
	                root_3=root_3.next;
	            }
	            
		}
		obj.printLinkedList();

	}

}
