package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReversArray {
		public void reverse(int arr[],int size)           // Actually Reverse of Arrays
		{  
			int temp=0;
			for (int i=0;i<size/2;i++)
			{
				 temp = arr[i];
		        arr[i] = arr[size-i-1];
		        arr[size-i-1] = temp;
			}
			
			System.out.println(Arrays.toString(arr));
		}

		public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of array : ");
	     int size=sc.nextInt();
	     
	     int arr []=new int [size];
	     System.out.println("Enter array elements : ");
	     for(int i=0;i<size;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     ReversArray r=new ReversArray();
	     r.reverse(arr, size);
		}

	}



