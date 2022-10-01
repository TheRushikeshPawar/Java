package NestedForLoop;

import java.util.Scanner;

public class X_Pattern {

	public static void main(String[] args) {
             
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Number :");
		 int r=sc.nextInt();
		 
		 for(int i=r;i>=1;i--)
		 {
			 for(int k=1;k<=r-i;k++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
		 for(int i=2;i<=r;i++)
		 {
			 for(int k=1;k<=r-i;k++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
			 
		 }

		

	}

}
