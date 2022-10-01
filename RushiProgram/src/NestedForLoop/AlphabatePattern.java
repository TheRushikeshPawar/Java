package NestedForLoop;

import java.util.Scanner;

public class AlphabatePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the Value");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+96)+" ");
				
			}
			System.out.println();
		}

	}

}
