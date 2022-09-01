package NestedForLoop;

import java.util.Scanner;

public class NestedForm_ForLoopStarPattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Total No.of Rows :");
	
	int r=sc.nextInt();      //r=rows            Assending Order
	
	 /*for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();         
	}
	
	for(int i=r-1;i>=1;i--)                      // Dessending Order
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();*/
	
	for(int i=r;i>=1;i--)                      // Dessending Order
	{
		for (int j=r;j>=i;j--)
		{
			System.out.print(" ");
		}
		
		  for(int k=1;k<=i;k++) 
		  {
			  System.out.print("* "); 
			  }
		 
		System.out.println();
	   }

	}

}
