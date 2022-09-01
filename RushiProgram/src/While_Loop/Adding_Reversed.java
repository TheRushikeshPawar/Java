package While_Loop;

import java.util.Scanner;

public class Adding_Reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num,sum=0,rev=0;
		num=sc.nextInt();
		
		while(num!=0)
		{
			int a=num%10;
			sum=sum+a;
			rev=rev*10+a;
			num=num/10;
		}

		System.out.println("Addition of Digit Is :" + sum);
		System.out.println("Revers Digits : "+rev);
	}

}
