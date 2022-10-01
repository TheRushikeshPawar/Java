package array;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementsRemove {
	
	static void removeDuplicate(int arr[],int n)
	{
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[n-1];
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Size");
		int s1=sc.nextInt();
		
		int a1[]=new int [s1];      //Fist Array
		
		System.out.println("Enter First Array Elements :");
		for(int i=0;i<s1;i++)
		{
			a1[i]=sc.nextInt();
		}
		 
		System.out.println("Enter The Second Array Size :");
		int s2=sc.nextInt();
		int b1[]=new int[s2];                        //Second Array
		
		System.out.println("Enter The Second Array Elements :");
		for(int i=0;i<s2;i++)
		{
			b1[i]=sc.nextInt();
		}
		
		int len=a1.length+b1.length;                 //Merge two arrays
		
		
		int c1[]=new int [len];
		
		for(int i=0;i<a1.length;i++)
		{
			c1[i]=a1[i];
		}
		int a=a1.length;
		
		for(int i=0;i<b1.length;i++)
		{
			c1[a+i]=b1[i];
		}
		
		
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		
		removeDuplicate(c1,len);
	}

}
