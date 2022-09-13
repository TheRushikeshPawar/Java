package arraySorting;

import java.util.Arrays;

public class ArraySort {
	
	void sorting(int arr[])             //Second Logic Of Sorting
	{
		int leg=arr.length; 
		for(int i=0;i<arr.length;i++)                //Bubble sorting
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {54,32,55,67,89,32,22,43};
		ArraySort a=new ArraySort();
		a.sorting(arr);

	}

}
