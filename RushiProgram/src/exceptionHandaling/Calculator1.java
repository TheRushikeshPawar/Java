package exceptionHandaling;

import java.util.Scanner;

public class Calculator1 {
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is : "+c);
	}
	void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication is :"+c);
	}
	void div(int a,int b)
	{
		try                          //Exception Handling 
		{
		int c=a/b;
		System.out.println("Division is :"+c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter b Value");
		int b=sc.nextInt();
		
		Calculator1 c1=new Calculator1();
		c1.add(a, b);
		c1.multiply(a, b);                          // Another Way 
		c1.div(a, b);
		

	}

}
