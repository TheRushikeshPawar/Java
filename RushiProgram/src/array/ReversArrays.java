package array;

import java.util.Scanner;

public class ReversArrays {
	
	void reversPrint(int arr[],int size)                // It is just a Print Reverse Array
	{
		System.out.println("Reverse of Array is :");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Array size :");
		 int size=sc.nextInt();
		 
		 int arr[]=new int[size];
		 
		 System.out.println("Enter Array Elements :");
		 for(int i=0;i<size;i++)
		 {
			 arr[i]=sc.nextInt();
		 }

		 ReversArrays r=new ReversArrays();
		 r.reversPrint(arr, size);
	}

}
