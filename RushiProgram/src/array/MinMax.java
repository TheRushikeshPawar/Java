package array;

import java.util.Scanner;

public class MinMax {

	public void maxMin(int arr[],int size) 
	{
	      int max = arr[0], min=arr[0];
	     
	      for(int i=0; i<size; i++ )
	      {
	         if(arr[i]>max) 
	         {
	            max = arr[i];
	         }
	         if(arr[i]<min) 
	         {
	            min = arr[i];
	         }
	        
	      }
	      System.out.println("Maximum Number is :"+max);
	      System.out.println("Maximum Number is :"+min);
	    }
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		System.out.println("Enter The Elements Of Array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		MinMax m=new MinMax();
		m.maxMin(arr, size);
		

	}

}
