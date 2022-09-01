package NestedForLoop;

import java.util.Scanner;

public class Power_of_Number {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The Number :");
				int num=sc.nextInt();
				System.out.println("Enter The Power :");
				int power=sc.nextInt();
		int product=1;
		
			    for (int c=1;c<=power;c++) 
			    {
			     product=product*num;
			    }
		
			    System.out.println("Power is = " + product);
		
				
			}
		
		}
