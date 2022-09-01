package If_else_Statement;

import java.util.Scanner;

public class GretestNumber {

	public static void main(String[] args) {
	  int a,b,c;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The First Number :");
      a=sc.nextInt();
      System.out.println("Enter Second Number :");
      b=sc.nextInt();
      System.out.println("Enter Third Number :");
      c=sc.nextInt();
      
      if(a>b && a>c)
      {
    	  System.out.println("Gretest Number is :"+a);
      }
      else if(b>a && b>c)
      {
    	  System.out.println("Gretest Number is :"+b);
  
      }
      else
      {
    	  System.out.println("Gretest Number is :"+c);
      }
	}

}
