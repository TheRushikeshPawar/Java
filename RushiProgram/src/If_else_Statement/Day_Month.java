package If_else_Statement;

import java.util.Scanner;

public class Day_Month {

	public static void main(String[] args) {
	int month;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Month 1 to 12 :");
	month=sc.nextInt();
	if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12)
	{
		System.out.println("31 days in month");
	}
	
	else if(month == 4 || month == 6 || month == 9 || month == 11)
	{
		System.out.println("30 days in month");
		
	}
	else if(month == 2)
	{
		System.out.println("28 or 29 days in month");
		
	}
	else
		System.out.println("Enter valid number 1 to 12");
}
}
