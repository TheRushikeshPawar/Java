package array2D;
import java.util.Scanner;

public class Arraay2D {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		int arr[][]=new int [r][c];
		System.out.println("Enter The Arrays Elements :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Array Elements are :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
		/*		if(i==j)                              // diagonal elements
				System.out.print(arr[i][j]+" ");
				else
					System.out.print("  ");         */
				
	    /*		if(j>i)                              // Upper Triangular matrix
					System.out.print(arr[i][j]+" ");
				else
					System.out.print("  ");        */
				
				
				if(i>j)                              // Lower Triangular matrix
					System.out.print(arr[i][j]+" ");      
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
