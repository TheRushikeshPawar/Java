package stringinJava;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Name :");
		String n1=sc.nextLine();
		
		System.out.println("Enter Second Name :");
		String n2=sc.nextLine();
		
		if(n1.length()==n2.length())
		{
			char ch1[]=n1.toCharArray();
			char ch2[]=n2.toCharArray();
			
			Arrays.sort(ch1);                          //by using method
			
			
			for(int i=0;i<ch2.length;i++)           //     by bubble sort method
			{
				for(int j=0;j<ch2.length-1;j++)
				{
					if(ch2[j+1]<ch2[j])
					{
						char temp=ch2[j+1];
						ch2[j+1]=ch2[j];
						ch2[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			int count=0;
			
			for(int i=0;i<ch1.length;i++) {
			
			if(ch1[i]!=ch2[i])
			{
				break;
			}
			else
			count++;
		}
			if(count==ch1.length)
			{
				System.out.println("Fisrt Name and Second Name are Anagram");
			}
			
		else {
			System.out.println("Fisrt Name and Second Name are not anagram");
		}
		

	}

  }
}
