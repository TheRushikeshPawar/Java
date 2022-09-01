package If_else_Statement;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age :");
		int age=sc.nextInt();
		if(age>0)
		{
			int goldcoin=age*age*age;
			System.out.println("Meenu gets "+goldcoin+" coins");
		}
		else
			System.out.println("Invalid Age");
	}

}
