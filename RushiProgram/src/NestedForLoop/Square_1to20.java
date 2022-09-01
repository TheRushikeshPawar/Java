package NestedForLoop;

import java.util.Scanner;

public class Square_1to20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Given Number Square is :");
		for(int i=1;i<=20;i++)
		{
		int sqr=i*i;
		System.out.println(i+ " = "+sqr);
		}

	}

}
