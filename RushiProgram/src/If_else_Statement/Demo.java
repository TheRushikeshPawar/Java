package If_else_Statement;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Chaacter :");
		char ab=sc.next().charAt(0);
		 
		if (ab>= '0'&& ab<='9')
		{
		System.out.println("It is a Number");
	}
		else if (ab == '@' || ab =='$' || ab== '&')
		{
			System.out.println("It is a Spacial Character");
		}
		else 
			System.out.println("It is a Character");
}
	
}