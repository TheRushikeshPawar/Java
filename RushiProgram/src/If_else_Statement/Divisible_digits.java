package If_else_Statement;

import java.util.Scanner;

public class Divisible_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		if(a % 3 == 0 && a % 8 ==0)
		{
			System.out.println("Divisible by Both ");
		}
		else
			System.out.println("Not Divisible");

	}

}
