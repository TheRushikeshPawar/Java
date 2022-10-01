package NestedForLoop;

import java.util.Scanner;

public class ZeroOneExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			 System.out.println();
		}

	}

}
