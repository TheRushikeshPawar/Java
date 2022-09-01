package Classes_objects_Method;

import java.util.Scanner;

public class Factorial {

	void factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is :"+fact);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		
		Factorial f1=new Factorial();
		f1.factorial(n);
		

	}

}
