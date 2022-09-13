package array2D;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Row Size :");
		int r=sc.nextInt();                           // r=row
		System.out.println("Enter The Column Size :");
		int c=sc.nextInt();                           // c=column
		
		int arr[][]=new int [r][c];
		System.out.println("Enter The Elements Of Arrays :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<r;i++)                     //Transpose of Matrix
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
