package Classes_objects_Method;

import java.util.Scanner;

		public class StarPattern {
			void star(int a)
			{
				for(int i=1;i<=a;i++)
				{
				  for (int j=1;j<=i;j++)
				  {
				    System.out.print("* ");
				  }
				  System.out.println();
			  }
				
			}
			
		
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number");
				int r=sc.nextInt();
				
				StarPattern s1=new StarPattern();
				s1.star(r);
		
			}
		
		}
