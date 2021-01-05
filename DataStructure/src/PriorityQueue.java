import java.util.Scanner;

public class PriorityQueue {

	private static int PQ[];
	private static int Front;
	private static int Rear;
	private int MaxSize;
	public PriorityQueue(int Size) {
		MaxSize=Size;
		Front=0;
		Rear=-1;
		PQ=new int[MaxSize];
	}
	
	public void Enqueue(int e)
	{
		int i,j,temp;
		Rear++;
		PQ[Rear]=e;
		for(i=Front;i<Rear-1;i++)
		{
			for(j=Front;j<Rear-1;j++)
			{
				if(PQ[i]>PQ[j+1])
				{
					temp=PQ[j];
					PQ[j]=PQ[j+1];
					PQ[j+1]=temp;
				}
			}
		}
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
		int temp=PQ[Front];
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
			System.out.println(PQ[i]);
	}
	
	public static void main(String[] args) {
		int ch,e,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of Linear Queue : ");
		n=in.nextInt();
		PriorityQueue q = new PriorityQueue(n);
		
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
