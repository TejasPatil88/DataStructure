import java.util.*;
public class BubbleSort {
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
    public void Bubblesort()
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorting done......");
    }
    
    public static void main(String args[])
    {
        BubbleSort obj=new BubbleSort();
        obj.input();
        obj.printArray();//before
        obj.Bubblesort();
        obj.printArray();//after
    }
}
