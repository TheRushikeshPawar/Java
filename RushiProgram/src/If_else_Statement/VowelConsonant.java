package If_else_Statement;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Given charachter is vowel ");
		}
		else 
			System.out.println("Given character is Consonant");
	}


}
