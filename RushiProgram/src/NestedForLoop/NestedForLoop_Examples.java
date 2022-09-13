package NestedForLoop;

import java.util.Scanner;

public class NestedForLoop_Examples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
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
		
		
		  for (int i=1;i<=r;i++)
		  { 
		  for (int j=1;j<=i;j++) 
		  {
		   if(i%2==0) 
		   {
		  System.out.print(1); 
		  } 
		  else{ System.out.print(0);
		   }
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
		  for (int j=1;j<=i;j++) 
		  {
		   System.out.print((char)(64+i)+" ");
		  
		  } System.out.println(); 
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
		
	
		}
		
	}
}
