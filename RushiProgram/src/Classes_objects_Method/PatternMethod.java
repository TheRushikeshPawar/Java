package Classes_objects_Method;

import java.util.Scanner;

public class PatternMethod {
	
	void starpattern(int r)
	{
		for (int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void numberpattern(int r)
	{
		for (int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if (i%2==0)
				{
					System.out.print(1);
				}
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternMethod p1=new PatternMethod();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Star Pattern :");
		System.out.println("2.Number Pattern :");
		System.out.println("Enter a choise :");
		
		int ch=sc.nextInt();
		switch(ch)
				{
				case 1:System.out.println("Enter a Number :");
				int s=sc.nextInt();          //s=randome variable
				p1.starpattern(s);
				break;
				
		
				case 2:System.out.println("Enter a Number :");
				int n=sc.nextInt();               // n=randome variable
				p1.numberpattern(n);
				break;
				
				default:System.out.println(" Enter Valid Number.....!!! :");
 
				}
	}

}
