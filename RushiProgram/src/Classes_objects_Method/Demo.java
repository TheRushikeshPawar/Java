package Classes_objects_Method;

import java.util.Scanner;

public class Demo {

	void factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is :"+fact);
	}
	void power(int num,int power)
	{
		int product=1;
		for (int i=1;i<=power;i++)
		{
			product=product*num;
		}
		System.out.println(num+"^"+power+":"+product);
	}
	
	public static void main(String[] args) {
		
		  Demo d1=new Demo();
		  Scanner sc=new Scanner(System.in); 
		  
			/*
			 * int n=sc.nextInt();
			 * 
			/ * Demo d1=new Demo(); 
			 * d1.factorial(n);
			 * 
			 * System.out.println("Enter a Number :");
			 *  int num=sc.nextInt();
			 * System.out.println("Enter a Power"); 
			 * int power=sc.nextInt();
			 * 
			 * Demo d2=new Demo();
			 *  d1.power(num, power);
			 */
		  
		  System.out.println("1.Factorial :");
		  System.out.println("2.Power :");
		  System.out.println("Enter a choice :");
		  int ch=sc.nextInt();
		  
		  switch(ch)
		  {
		  case 1:System.out.println("Enter a Number :");
		         int n=sc.nextInt();
		         d1.factorial(n);
		         break;
		  
		  
		  case 2: System.out.println("enter a number to find the power :");
		         int num=sc.nextInt();
		         System.out.println("Enter The Power :");
				  int p=sc.nextInt();
				  d1.power(num, p);
				  break;
		  
		  default:System.out.println("Enter Valid Number ....!!!");
		
		  }
	}

}
