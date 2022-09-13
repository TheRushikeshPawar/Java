package array2D;

import java.util.Scanner;

public class SumRowColumn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Rows Size :");
		int r=sc.nextInt();
		System.out.println("Enter The Colum Size :");
		int c=sc.nextInt();
		
		int arr[][]=new int [r][c];
		System.out.println("Enter The Elements of Array :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0;i<r;i++)                //Matrix
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<r;i++)                //Sum of Rows
		{
			int sumRow=0;
			for(int j=0;j<c;j++)
			{
				sumRow=sumRow+arr[i][j];
			}
			System.out.println("Sum of Row "+(i+1)+" is : "+ sumRow);
		}
		System.out.println();
		
		for(int i=0;i<r;i++)                    //Sum of Columns
		{
			int sumColumn=0;
			for(int j=0;j<c;j++)
			{
				sumColumn=sumColumn+arr[j][i];
			}
			System.out.println("Sum of Column "+(i+1)+" is : "+ sumColumn);
		}

	}

}
