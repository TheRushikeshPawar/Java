package stringinJava;

import java.util.Arrays;
import java.util.Scanner;

public class CharachterFind {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentance :");
		//String s1="Java is Programming language";
	   	String s1=sc.next();
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
			
		}
		System.out.println();
		System.out.println("Enter Character :");
		
		char c=sc.next().charAt(0);
		
		char ch[]=s1.toCharArray();
		
		System.out.println(c+" Charachter is Present at ");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				count++;
				System.out.println(i+" ");
			}
		}
		System.out.println("\n"+count+ " time");
	}

}
