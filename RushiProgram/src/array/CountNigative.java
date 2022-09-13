package array;

import java.util.Scanner;

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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of Array : ");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		System.out.println("Enter The Elements of Array : ");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		CountNigative n1=new CountNigative();
		n1.countNigative(arr, size);

	}
}
