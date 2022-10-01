package demoWhileLoop;

import java.util.Scanner;

public class Addition_whileLooping {

	public static void main(String[] args) {
		
			int evensum=0,oddsum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The limit :");
			int limit=sc.nextInt();
			int c=1;
			while(c<=limit)
			{	
				if(c%2==0)
			        evensum=evensum+c;
				else
					oddsum=oddsum+c;
			 c++;
			}
			
			System.out.println("Even Number Sum is :"+evensum);
			System.out.println("Odd number Sum is : "+oddsum);
		}
	
	}
