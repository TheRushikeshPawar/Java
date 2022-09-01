package array;

import java.util.Scanner;

public class AdditionEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size Of Array : ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the Elements of array : ");
		
		for(int i=0;i<size;i++)
			
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0,sumE=0,sumO=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
			if(arr[i]%2==0)
			{	
				sumE=sumE+arr[i];
			}
			else
			{
				sumO=sumO+arr[i];
			}
			
		}
    System.out.println("Additon of Even Elements is :"+sumE);
    System.out.println("Additon of Odd Elements is :"+sumO);
    System.out.println("Additon of Total Elements is :"+sum);
	}

}
