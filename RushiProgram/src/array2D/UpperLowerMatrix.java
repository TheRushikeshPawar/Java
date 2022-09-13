package array2D;

import java.util.Scanner;

public class UpperLowerMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Row Size :");
		int r=sc.nextInt();
		System.out.println("Enter The Column Size :");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("Enter The Array Elements :");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		int sumL=0,sumU=0;
		for(int i=0;i<r;i++)
		{  
			
			for(int j=0;j<c;j++)
			{
				if(i>j)                  // Lower  Triangular Matrix
				{
					sumL=sumL+arr[i][j];
				}
				
				if(i<j)                  //Upper Triangular MAtrix
				{
					sumU=sumU+arr[i][j];
				}
			}
		}
		System.out.println("Sum of Lower Triangulr Matrix : " +sumL);
		System.out.println("Sum of Upper Triangulr Matrix : " +sumU);

	}

}
