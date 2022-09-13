package stringinJava;

import java.util.Scanner;

public class CharachterCapital {
	
	static void covertCase(String line)
	{
		System.out.println("Converted Case :"+line);
		char ch[]=line.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='A';
				
			}
			else if(ch[i]=='A')
			{
				ch[i]='a';
			}
		}
		String s1=new String(ch);
		System.out.println("New String is : "+s1);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String line=sc.nextLine();
		System.out.println("Enter The Character : ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter You Want Case :");
		char ch1=sc.next().charAt(0);
		
		covertCase(line);
		

	}

}
