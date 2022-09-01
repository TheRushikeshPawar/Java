package array;

import java.util.Scanner;

public class Multiplication {
	
	void multiplication(int arr[],int size)
	{
		int product=1;
		for(int i=0;i<size;i++)
		{
			product=product*arr[i];
		}
		System.out.println("Multiplication of Elements is : "+product);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Arrays :");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the Elements of Arrays :");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
      Multiplication m=new Multiplication();
      m.multiplication(arr, size);
	}

}
