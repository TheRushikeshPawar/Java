package demoWhileLoop;

import java.util.Scanner;

public class SperateDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			num=num%10;
			System.out.print(" ");
		}

	}

}
