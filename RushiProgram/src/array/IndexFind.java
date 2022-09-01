package array;

import java.util.Scanner;

public class IndexFind {
	
	public void FindElementPosition(int arr[],int x)     // x= number you want find
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
				System.out.println("Element Position is :"+i);
			}
		}
		System.out.println("Element found "+x);
		System.out.println("Element Repetation :"+count);
	}

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		System.out.println("Enter The Elements Of Array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Elements You want find :");
		int x=sc.nextInt();
		
		IndexFind f=new IndexFind();
		 f.FindElementPosition(arr, x);
		
	}
}
