package If_else_Statement;

import java.util.Scanner;

public class divisibility_digits {

	public static void main(String[] args) {
		int n;

		Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number :");
n=sc.nextInt();
if (n % 5 == 0)
{
	System.out.println("Number Divide by 5");
}
else if (n % 11 ==0)
{
	System.out.println("Number Divide by 11");
	}
else
	System.out.println("Dose not Divide by Any");
	}
}
