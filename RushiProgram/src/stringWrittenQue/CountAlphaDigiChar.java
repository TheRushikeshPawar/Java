package stringWrittenQue;

import java.util.Scanner;

public class CountAlphaDigiChar {

	public static void main(String[] args) {
		
		int alph=0;
		int digi=0;
		int sChar=0;                   //sChar =Special Character
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alpha Numeric Spacial Character String :");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				alph++;
			}
			else if(ch>='0' && ch<='9')
			{
				digi++;
			}
			else
			{
				sChar++;
			}
		}
		System.out.println("Number Of Aplphabet Character : "+alph);
		System.out.println("Number Of Digits Character : "+digi);
		System.out.println("Number of Spacial Character : "+sChar);

	}

}
