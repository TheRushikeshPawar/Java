package While_Loop;

import java.util.Scanner;

public class WhileLooping {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Limits :");
			int limit=sc.nextInt();
			int c=1;
			while(c<=limit)
			{
				if(c%2==0)
					
				System.out.println("Number is Even :"+c);
				
				else
					System.out.println("Number is Odd :"+c);
				c++;
			}
			
	        System.out.println("Done");
		}
	
	}
