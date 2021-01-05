
public class MergeSort {

	public static void mergeSort(int[] array,int low ,int high)
	{
		if(high<=low)return;
		
		int mid = (low+high)/2;
		mergeSort(array,low,mid);
		mergeSort(array,mid+1,high);
		merge(array,low,mid,high);
	}
	
	public static void merge(int[]array,int low,int mid,int high)
	{
		int i = low;
		int j = mid+1;
		int k = high;
		int b[]= {};
		while(i<=mid && j<=high)
		{
			if(array[i]<=array[j])
			{
				b[k++]=array[i++];
			}
			else
			{
				b[k++]=array[j++];
			}
		}
		if(i>mid)
		{
			while(j<=high)
			{
				b[k++]=array[j++];
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k++]=array[i++];
			}
		}
		for(k=low;k<=high;k++)
		{
			array[k]=b[k];
		}
	}
	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
		obj.mergeSort(array,0, array.length-1);

	}

}
