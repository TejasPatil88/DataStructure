import java.util.Scanner;

public class InsertionSort {
	private int a[];
    public void input()
    {
        System.out.println("Enter size:");
        @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        a=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
    }
    public void printArray()
    {
        System.out.println("Array has ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public void Insertionsort()
    {
    	for(int i=1;i<a.length;i++)
    	{
    		int temp = a[i];
    		int j = i-1;
    		while (j>=0 && a[j]>temp)
    		{
    			a[j+1] = a[j];
    			j = j-1;
    		}
    		a[j+1] = temp;
    	}
    	System.out.println("Sorting done......");
    }

	public static void main(String[] args) {
		InsertionSort obj=new InsertionSort();
        obj.input();
        obj.printArray();//before
        obj.Insertionsort();
        obj.printArray();//after

	}

}
