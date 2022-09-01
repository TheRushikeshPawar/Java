package array;

public class Addition {
	
	void additionArrays(int arr[],int size)
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Addition of Elements of Array  : "+sum);
	}

}
