package stringinJava;

import java.util.Scanner;

public class UniqueCharachter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String :");
	    String s=sc.nextLine();
	    s=s.toUpperCase();
	    char ch[]=s.toCharArray();
	    
	    for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				
			}
			if(count==1)
				System.out.print(s.charAt(i)+" ");
			}
	  }
}

