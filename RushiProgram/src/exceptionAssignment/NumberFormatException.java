package exceptionAssignment;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  int age;
		  try
		  {
			  System.out.println("Please Enter Age :");
			  age=Integer.parseInt(sc.next());
			  
			  System.out.println("Your Age is : "+age);
		  }
		  catch(Exception e)
		  {
			  System.out.println("The Number Format Exception");
			  System.out.println("Please Enter Valid Age");
		  }
	}

}

