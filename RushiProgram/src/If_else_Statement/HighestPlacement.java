package If_else_Statement;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student placed in CSE :");
		System.out.println("Enter the number of student placed in ECE :");
		System.out.println("Enter the number of student placed in MECH :");

	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println("Highest Placement CSE ");

	}
	else if(b>a && b>c)
	{
		System.out.println("Highest Placement ECE ");
	}
	else if (c>a && c>b)
	{
		System.out.println("Highest Placement MECH");
	}
	else if (a<0 || b<0 || c<0) {
		
		System.out.println("Invalid input");
	}

	else if (a==b && b==c && c==a)
	{
		System.out.println("Non of the Department Has Got Placement");
	}

	else if(a==b)
	{
	System.out.println("Highest Placement In CSE & ECE ");	
	}
	else if(a==c)
	{
		System.out.println("Highest Placement in CSE & MECH");
	}
	else
	{
		System.out.println("Highest Placement in ECE & MECH");
}
}
}
