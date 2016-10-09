
public class QuickSort {
public static void Swap(int left, int right, int[] arr)
{
	int temp = arr[left];
	arr[left]= arr[right];
	arr[right]= temp;
}

public static int Partition(int left, int right, int pivot, int[] arr)
{
	int leftIndex = left -1;
	int rightIndex = right;
	while(true)
	{
		while(arr[++leftIndex] < pivot)
		{
			//do nothing			
		}
		while(rightIndex > 0 && arr[--rightIndex] > pivot)
		{
			//do nothing			
		}
		
		if(leftIndex >= rightIndex)
		{
			break;			
		}else{
		//	System.out.println("items "+arr[leftIndex]+"and "+arr[rightIndex]+" swapped ");
			Swap(leftIndex,rightIndex,arr);
		}
	}
	//System.out.println(" pivot swapped: "+ arr[leftIndex]+ " and " +arr[right] );//(" pivot swapped :%d,%d\n", intArray[leftPointer],intArray[right]);
	   Swap(leftIndex,right,arr);
	   return leftIndex;
}

public static void Sorting(int left, int right, int[] arr)
{
	if(right - left <= 0)
	{
		return;
	}else
	{
		int pivot = arr[right];
	    int partitionPoint = Partition(left, right, pivot, arr);
	    Sorting(left,partitionPoint-1,arr);
	    Sorting(partitionPoint+1,right, arr);
	}

}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {10,2,31,11,25,15,7,11,5,22,9};
		System.out.print("Before sorting ");
		for(int n : arr)
		{
			System.out.print(n + " ");
		}
		QuickSort.Sorting(0, arr.length-1, arr);
		System.out.print("\nAfter sorting ");
		for(int n : arr)
		{
			System.out.print(n + " ");
		}
	}

}
