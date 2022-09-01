package While_Loop;

import java.util.Scanner;

public class Multiplication_Digits {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Numbers :");
int num=sc.nextInt();
int product=1;

while(num!=0)
{
	int r=num%10;
	product=product*r;
	num=num/10;
}
System.out.println("Multiplication of Digits is :"+product);
	}

}
