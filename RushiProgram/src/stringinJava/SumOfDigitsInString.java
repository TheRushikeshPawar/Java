package stringinJava;

import java.util.Scanner;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		int sum=0;
		int product=1;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+(ch[i]-48);
				product=product*(ch[i]-48);
			}
		}
         System.out.println("Sum of Digits are : "+sum);
         System.out.println("Product of Digit :"+product);
	}

}
