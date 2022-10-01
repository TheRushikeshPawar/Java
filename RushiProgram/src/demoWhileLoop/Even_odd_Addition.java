package demoWhileLoop;

import java.util.Scanner;

public class Even_odd_Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int limit=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		int c=1;
		
		while(c<=limit)
		{
			if (c%2==0)
				evensum=evensum+c;			
			else
				oddsum=oddsum+c;		
		c++;
		}
			System.out.println("Even sum is "+evensum);
			System.out.println("Odd sum is "+oddsum);
		}
	}
