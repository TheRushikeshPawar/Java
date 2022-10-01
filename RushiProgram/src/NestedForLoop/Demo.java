package NestedForLoop;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Total No.of Rows :");
		
		int r=sc.nextInt();      //r=rows   
		
		 /*for(int i=1;i<=r;i++)
		{
			 for(int k=1;k<=r-i;k++)
			 {
				 System.out.print(" ");
			 }
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();  */     
			
			
		/*	
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(); */     
			
			

	/*  	for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)+(i+64));
			}
			System.out.println();      */
		
		
		
		/*for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)+(64+j));
			}
			System.out.println();*/
		
		/*int count=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println();*/
		
		
			// Charecter Nester For Loop
		/*	char ch='a';
		 for(char i='a';i<='e';i++)
		 {
			 for(char k=1;k<=r-i;k++)
			 {
				 System.out.print(" ");
			 }
			for(char j='a';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			ch++;
			}
		 ch--;
		 for(char i='d';i>='a';i--)
		 {
			 for(char k=1;k<=r-i;k++)
			 {
				 System.out.print(" ");
			 }
			 for(char j='a';j<=i;j++)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();    */
		
		
		
		/*for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
	System.out.print(" ");
			}
			
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
	
		
		System.out.println();
	}
		for(int i=r-1;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
			
		for(int i=r;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
			
			
		}*/
		
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=r;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		
		}
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
		     if(i%2==0)
		     {
		    	 System.out.print(1);
		     }
		     else
		     {
		    	 System.out.print(0);
		     }
			}
			System.out.println();
		}
		System.out.println();
	}
}
	
	
