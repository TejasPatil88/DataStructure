import java.util.Scanner;

public class CircularQueue {

	private static int CQ[];
	private int Front;
	private static int Rear;
	private static int MaxSize;
	private static int Count;
	public CircularQueue(int Size) {
		Count = 0;
		MaxSize=Size;
		Front=0;
		Rear=-1;
		CQ=new int[MaxSize];
	}
	
	public static void Enqueue(int e)
	{
		Count++;
		Rear=(Rear+1)%MaxSize;
		CQ[Rear]=e;
	}
	
	public boolean isFull()
	{
		if(Count==MaxSize)
			return (true);
		else
			return (false);
	}
	
	public int Dequeue()
	{
		Count--;
		int temp=CQ[Front];
		Front=(Front+1)%MaxSize;
		return(temp);
	}
	
	public boolean isEmpty()
	{
		if(Count==0)
			return(true);
		else
			return(false);
	}
	
	public void printCircularQueue()
	{
		int i,c;
		i=Front;
		for(c=0;c<Count;c++)
		{
			System.out.println(CQ[i]);
			i=(i+1)%MaxSize;
		}
	}

	public static void main(String[] args) {
		
		int ch,e,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of CircularQueue : ");
		n=in.nextInt();
		CircularQueue cq = new CircularQueue(n);
		
		do
		{
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.printQueue\n0.Exit\n");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				if(cq.isFull()!=true)
				{
					System.out.println("Enter Elements : ");
					e=in.nextInt();
					cq.Enqueue(e);
				}
				else
				{
					System.out.println("Queue is Full");
				}
				break;
			case 2:
				if(cq.isEmpty()!=true)
				{
					System.out.println("Element dequeued : "+cq.Dequeue());
				}
				else
				{
					System.out.println("Queue Empty");
				}
				break;
			case 3:
				if(cq.isEmpty()!=true)
				    cq.printCircularQueue();
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
