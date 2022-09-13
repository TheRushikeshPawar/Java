package stringinJava;

import java.util.Scanner;

public class ShortName {
	
	static void replaceStr1(String str1)
	{
		char c1[]=str1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[0]>='a' && c1[0]<='z')
			{
				System.out.print((char)(c1[0])+".");
				break;
			}
			else if(c1[0]>='A' && c1[0]<='Z')
			{
				System.out.print((char)(c1[0])+".");
				break;
			}
		}
	}
	static void replaceStr2(String str2)
	{
		char c2[]=str2.toCharArray();
		for(int i=0;i<c2.length;i++)
		{
			if(c2[0]>='a' && c2[0]<='z')
			{
				System.out.print((char)(c2[0]-32)+".");
				break;
			}
			else if(c2[0]>='A' && c2[0]<='Z')
			{
				System.out.print((char)(c2[0])+".");
				break;
			}
		}
	}
	static void replaceStr3(String str3)
	{
		char c3[]=str3.toCharArray();
		for(int i=0;i<c3.length;i++)
		{
			if(c3[0]>='a' && c3[0]<='z' && c3[i]==c3[0])
			{
				System.out.println((char)(c3[0]));
			}
			else
			{
				System.out.print(c3[i]);
			}
		}
		System.out.println(".");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name :");
		String fn=sc.nextLine();
		System.out.println("Enter Middle Name :");
		String mn=sc.nextLine();
		System.out.println("Enter Last Name :");
		String ln=sc.nextLine();
		
		System.out.print("Your Full Name is : \n"+fn+" "+mn+" "+ln+". "+" \n");
		
		replaceStr1(fn);
		replaceStr2(mn);
		replaceStr3(ln);
		
	      
	}
}
