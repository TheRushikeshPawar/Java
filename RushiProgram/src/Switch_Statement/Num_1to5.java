package Switch_Statement;

import java.util.Scanner;

public class Num_1to5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
			default:
				System.out.println("Innvalid Number Entired !!!");
		}

	}

}
