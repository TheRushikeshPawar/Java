package Classes_objects_Method;

import java.util.Scanner;

public class SimpleIntrest {
	float variable(float p,float r,float t)
	{
		float product=p*r*t;
		return product;
	}
   void simpleIntrest(float product)
   {
	   float si=product/100;
	   System.out.println("Simple Intrest is :"+si);
   }
	public static void main(String[] args) {
		
		SimpleIntrest s1=new SimpleIntrest();
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter The Price :");
		  int p=sc.nextInt();
		  System.out.println("Enter the Rate :");
		  int r=sc.nextInt();
		  System.out.println("Enter The Time :");
		  int t=sc.nextInt();
		  
		  float product=s1.variable(p, r, t);
		   s1.simpleIntrest(product);		

	}

}
