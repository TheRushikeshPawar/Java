package exceptionHandaling;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Value Of a :");
		a=sc.nextInt();
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		
		try 
		{
			c=a/b;
			System.out.println("Division is : "+c);	
		}
		catch(Exception e)
		{
			System.out.println(e);
			//e.printStackTrace();              // another way of printing
		}
		
		
		c=a+b;
		System.out.println("Addion is : "+c);
		
		c=a-b;
		System.out.println("substraction is :"+c);
		
		c=a*b;
		System.out.println("Multiplication is :"+c);

	}

}
