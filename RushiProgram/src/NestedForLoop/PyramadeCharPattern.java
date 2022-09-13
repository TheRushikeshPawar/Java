package NestedForLoop;

import java.util.Scanner;

public class PyramadeCharPattern {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number :");
				int r=sc.nextInt();
				char ch='a';
				for (int i=1;i<=r;i++)
					
				{
					for(int k=1;k<=r-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++)
					{
						System.out.print(ch+" ");
					}
					System.out.println();
					ch++;
				}
		ch--;
		for(int i=r-1;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
		System.out.print(ch+" ");
			}
			System.out.println();
		    }
		  }
		
		}
