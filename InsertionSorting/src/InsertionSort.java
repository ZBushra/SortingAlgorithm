
public class InsertionSort {

	public static void sorting(int[] A)
	{
		int position;
		int valueToInsert;
		
		for(int i = 0; i < A.length; i++)
		{
			valueToInsert = A[i];
			position = i;
			
			while(position > 0 && A[position - 1] > valueToInsert)
			{
				A[position] = A[position - 1];
				position = position - 1;				
			}
			
			A[position] = valueToInsert;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = new int[] {30,10,3,30,22,4,7,20,15,15,7,19,30};
		InsertionSort.sorting(A);
		
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i]+ " ");
		}
	}

}
