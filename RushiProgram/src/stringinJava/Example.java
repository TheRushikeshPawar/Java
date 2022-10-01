package stringinJava;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		   // String str = "GeeksforGeeks";
		 
		    for (int i = 0; i < str.length(); i++)
		    {
		        int cnt = 0;
		        for (int j = 0; j < str.length(); j++)
		        {
		            // checking if two characters are equal
		            if (str.charAt(i) == str.charAt(j) && i != j)
		            {
		                cnt ++;
		                break;
		            }
		        }
		        if (cnt == 0)
		            System.out.print("Unique String is "+str.charAt(i));
		    }
		}

	}

