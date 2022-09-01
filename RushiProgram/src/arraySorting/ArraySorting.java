package arraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	
	void sortingArray(int arr[])
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
		System.out.println("Second Highest Element is :"+arr[leg-2]);
		System.out.println("Third Minimum Element is :"+arr[2]);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Element :");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		System.out.println("Enter The Elements Of Array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		ArraySorting a=new ArraySorting();
	    a.sortingArray(arr);
	}

}
