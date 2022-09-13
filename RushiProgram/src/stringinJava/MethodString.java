package stringinJava;

import java.util.Arrays;

public class MethodString {

	public static void main(String[] args) {
		
		String s1="Language";
		
		System.out.println("Printing Character Using Method :");
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
			
		}

		System.out.println("\n\n");
		System.out.println("Printing Charachter Without Using Method :");
		
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println("\n\n");
		String s="Java is Good Programming Language";
		
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
				
	}

}
