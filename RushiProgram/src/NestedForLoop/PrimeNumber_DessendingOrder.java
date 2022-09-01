package NestedForLoop;

import java.util.Scanner;

public class PrimeNumber_DessendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Dissending Order Number :");
		int num1,num2,i,j;
		
		System.out.println("Enter First Number :");
		num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		num2=sc.nextInt();
		
		for(i=num1;i>=num2;i--)
		{
			for(j=2;j<=i;j++)
			{
				if (i%j==0)
					break;
			}
			if(i==j)
				System.out.println(j+" ");
		}

	}

}
