package NestedForLoop;

import java.util.Scanner;

public class DimondNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(+j);
			}
		
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		for(int i=r-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(+j);		
			} 
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
