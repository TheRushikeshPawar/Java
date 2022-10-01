package array;

import java.util.Arrays;

public class Example {
	
	public static void secondHighest(int arr[])
	{
		int leg=arr.length;
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Secod Highest "+arr[leg-2]);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,5,6,4,3};
		
		Example e=new Example();
		secondHighest(arr);
		

	}

}
