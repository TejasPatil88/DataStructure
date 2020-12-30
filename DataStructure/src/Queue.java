import java.util.Scanner;

public class Queue {

	private static int Q[];
	private int Front;
	private static int Rear;
	private int MaxSize;
	public Queue(int Size) {
		MaxSize=Size;
		Front=0;
		Rear=-1;
		Q=new int[MaxSize];
	}
	
	public static void Enqueue(int e)
	{
		Rear++;
		Q[Rear]=e;
	}
	
	public boolean isFull()
	{
		if(Rear==MaxSize-1)
			return (true);
		else
			return (false);
	}
	
	public int Dequeue()
	{
		int temp=Q[Front];
		Front++;
		return(temp);
	}
	
	public boolean isEmpty()
	{
		if(Front>Rear)
			return(true);
		else
			return(false);
	}
	
	public void printQueue()
	{
		for(int i=Front;i<=Rear;i++)
			System.out.println(Q[i]);
	}
	public static void main(String[] args) {
		int ch,e,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of Queue : ");
		n=in.nextInt();
		Queue q = new Queue(n);
		
		do
		{
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.printQueue\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				if(q.isFull()!=true)
				{
					System.out.println("Enter Elements : ");
					e=in.nextInt();
					q.Enqueue(e);
				}
				else
				{
					System.out.println("Queue is Full");
				}
				break;
			case 2:
				if(q.isEmpty()!=true)
				{
					System.out.println("Element dequeued : "+q.Dequeue());
				}
				else
				{
					System.out.println("Queue Empty");
				}
				break;
			case 3:
				if(q.isEmpty()!=true)
				    q.printQueue();
				else
				{
					System.out.println("Queue Empty");
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

