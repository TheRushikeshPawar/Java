package Switch_Statement;

import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose your Operator :");
	
		System.out.println("1:Addition");
		System.out.println("2:Substraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Enter First Number :");
		a=sc.nextInt();
		System.out.println("Enter Second Number :");
		b=sc.nextInt();
			System.out.println("Addition is :"+(a+b));
		break;
		case 2:
			System.out.println("Enter First Number :");
			a=sc.nextInt();
			System.out.println("Enter Second Number :");
			b=sc.nextInt();
			System.out.println("Substraction is :"+(a-b));
		break;
		case 3:
			System.out.println("Enter First Number :");
			a=sc.nextInt();
			System.out.println("Enter Second Number :");
			b=sc.nextInt();
			System.out.println("Multiplication is :"+(a*b));
		break;
		case 4:
			System.out.println("Enter First Number :");
			a=sc.nextInt();
			System.out.println("Enter Second Number :");
			b=sc.nextInt();	
			if (b==0)
			{
				System.out.println("Denominator Canot be Zero..Enter A valid number");
				System.out.println("Enter a valid Dinominator :");
				b=sc.nextInt();
			}
			System.out.println("Division is:"+(a/b));
		break;
		default:System.out.println("Invalid input");
		}
		
		
		

	}

}
