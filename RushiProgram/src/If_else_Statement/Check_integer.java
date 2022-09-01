package If_else_Statement;

import java.util.Scanner;

public class Check_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Integer Number :");
int num=sc.nextInt();

if(num>0)
{
	System.out.println("Given Number is Positive ");
}
else if (num<0)
{
	System.out.println("Given Number Is Nigative");
}
else
	System.out.println("Given Number is Zero");
	}

}
