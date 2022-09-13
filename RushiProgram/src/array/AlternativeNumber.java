package array;

import java.util.Arrays;
import java.util.Scanner;

public class AlternativeNumber {
	
	void alternative(int arr[],int size)
	{
		int sum=0;
		for(int i=0;i<size;i=i+2)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size;i=i+2)
		{
			sum=sum+arr[i];
			
		}
		System.out.print("Sum of Alternative Numbers :"+sum);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter The Elements Of Array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		AlternativeNumber a=new AlternativeNumber();
		a.alternative(arr, size);
		
		
	}

}
