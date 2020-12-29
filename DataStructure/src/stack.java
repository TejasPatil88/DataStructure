import java.util.Scanner;

public class stack {
	private static int s[];
	private int MaxSize;
	private static int tos;
	stack(int Size)
	{
		MaxSize=Size;
		s=new int[MaxSize];
		tos=-1;
	}
	
	public static void push(int e)
	{
		tos++;
		s[tos]=e;
	}
	
	public boolean isFull()
	{
		if(tos==MaxSize-1)
			return (true);
		else
			return (false);
	}
	
	public static int pop()
	{
		int temp;
		temp=s[tos];
		tos--;
		return (temp);
	}
	
	public boolean isEmpty()
	{
		if(tos==-1)
			return(true);
		else
			return(false);
	}
	
	public void printStack()
	{
		for(int i=tos;i>-1;i--)
			System.out.println(s[i]);
	}
	
	public static int AtPeak()
	{
		return (s[tos]);
	}

	public static void main(String[] args) {
		stack obj=null;
		int ch,e,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size : ");
		n=in.nextInt();
		obj=new stack(n);
		do
		{
			System.out.println("\n1.Push\n2.Pop\n3.AtPeak\n4.print\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				if(obj.isFull()!=true)
				{
					System.out.println("Enter Elements : ");
					e=in.nextInt();
					stack.push(e);
				}
				else
				{
					System.out.println("Stack is Full");
				}
				break;
			case 2:
				if(obj.isEmpty()!=true)
				{
					System.out.println("Element poped"+stack.pop());
				}
				else
				{
					System.out.println("Stack Empty");
				}
				break;
			case 3:
				if(obj.isEmpty()!=true)
				{
					System.out.println("AtPeak "+obj.AtPeak());
				}
				else
				{
					System.out.println("Stack Empty");
				}
				break;
			case 4:
				if(obj.isEmpty()!=true)
				    obj.printStack();
				else
				{
					System.out.println("Stack Empty");
				}
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




















