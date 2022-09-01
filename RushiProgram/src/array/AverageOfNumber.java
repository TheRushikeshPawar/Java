package array;

import java.util.Scanner;

		public class AverageOfNumber {
			public void averageNumber(int arr[],int size)
			{
				int sum=0;
				double avg;
			for(int i=0;i<size;i++)
		    {
		  	  sum=arr[i]+sum;
		    }
			 avg=sum/size;
		System.out.println("Sum OF The Total Elements :"+sum);
		System.out.println("Average Of the Elements :"+avg);
		}
		
			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Size of Array :");
				int size=sc.nextInt();
				int arr[]=new int [size];
				System.out.println("Enter The Elements of Arrays :");
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				AverageOfNumber a=new AverageOfNumber();
				a.averageNumber(arr, size);
		
			}
		}
