package NestedForLoop;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size :");
		int r=sc.nextInt();
		
		
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
