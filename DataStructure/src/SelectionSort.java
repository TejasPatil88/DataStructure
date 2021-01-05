import java.util.Scanner;

public class SelectionSort {
	private int a[];
	private int temp;
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
    
    public void Selectionsort() {
    	int i,j,min = 0;
    	for(i=0;i<a.length-1;i++) {
    		min = i;
    		for(j=i+1;j<a.length;j++)
    			if(a[j]<a[min])
    			{
    				min=j;
    			}
    	}
    		temp = a[i];
    		a[i]=a[min];
    		a[min]=temp;
    		
    		System.out.println("Sorting done......");
    }
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		obj.input();
		obj.printArray();//before
        obj.Selectionsort();
        obj.printArray();//after
	}

}
