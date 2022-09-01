package NestedForLoop;

import java.util.Scanner;

public class Prime_Numbers_Assending {

			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Two Numbers 1 to n :");
		int num1,num2,i,j;
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		for(i=num1;i<=num2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
				if(i==j)
					System.out.println(j+" ");
	           	}
			}
		
		}
