package Classes_objects_Method;

import java.util.Scanner;

public class FabonacciNumbers {
	
	void fabonacci(int num)
	{
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=num;i++)
		{
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		FabonacciNumbers f1=new FabonacciNumbers();
        f1.fabonacci(num);
	}

}
