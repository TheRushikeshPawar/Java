package For_loop;

import java.util.Scanner;

public class Fibonacci_Series {

			public static void main(String[] args) {
			int num,a=0,b=1,c;
			System.out.println("Enter Numbers : ");  
			Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		       }
			
			}
		
		}
