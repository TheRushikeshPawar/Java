package stringWrittenQue;

import java.util.Scanner;

public class EncryptedValueAlphabate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence :");
		String s =sc.nextLine();
		
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int sum=0;
			char ch[]=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				int v=ch[j]-64;                // CHAPITAL LATTER
				
				sum=sum+v;
			}
			System.out.println(str[i]+" "+sum);
		}
		
		

	}

}
