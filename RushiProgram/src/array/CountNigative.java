package array;

public class CountNigative {

	void countNigative(int arr[],int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				count=count+1;
			}
			
		}
		System.out.println("Total Nigative Numbers are : "+count);
		
	}
}
