package stringWrittenQue;

import java.util.Scanner;

public class RemoveOccerance {
	
	static void remove(String str,char ch)
	{
		char d=' ';
		char temp;
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			
			if((char)ch==str.charAt(i))
			{
				temp=arr[i];
				arr[i]=d;
				d=temp;
				
			}
			else
			{
				System.out.println(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		System.out.println(str+"\n");
		System.out.println("Enter The Remove  Charecter");
		char ch = sc.next().charAt(0);
		
		remove(str,ch);
		
	

	}

}
