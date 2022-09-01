package array;

import java.util.Arrays;
import java.util.Scanner;

public class NumberReplace {
	
	void replaceNegative(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=arr[i-1]*arr[i-1];
			}
		}
		System.out.println("Replace Numbers Are :"+Arrays.toString(arr));
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
		
		NumberReplace n=new NumberReplace();
		n.replaceNegative(arr, size);

	}

}

