package array2D;

import java.util.Scanner;

public class TwoMatrixSubstract {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row size :");
		int r=sc.nextInt();
		System.out.println("Enter Column Size :");
		int c=sc.nextInt();
		
		int a[][]=new  int [r][c];            // 1st Matrix
		System.out.println("Enter 1st Matrix Elements :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		int b[][]=new int[r][c];
		System.out.println("Enter The 2nd Matrix Elements :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		int sub[][]=new int[r][c];          // sub =subtraction matrix
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Subtraction Of Two Matrix Is :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
	}

}
