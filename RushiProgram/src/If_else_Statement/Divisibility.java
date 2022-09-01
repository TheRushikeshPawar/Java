package If_else_Statement;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number :");
int num=sc.nextInt();
if(num % 5 == 0)
{
	System.out.println(num +" Divisible by 5");
}
else
	System.out.println(num +" Not Divisible by 5");
	}

}
