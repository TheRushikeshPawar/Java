package demoWhileLoop;

import java.util.Scanner;

public class Adding_Reversed {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int num,sum=0,rev=0;
		System.out.println("Enter the Number :");
		num=sc.nextInt();
		
		while(num!=0)
		{
			int a=num%10;
			sum=sum+a;
			rev=rev*10+a;
			num=num/10;
		}

		System.out.println("Addition of Digit Is :" + sum);
		System.out.println("Revers Digits : "+rev);
	}

}
