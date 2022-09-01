package Classes_objects_Method;

import java.util.Scanner;

public class AreaOf_Following {
	
	void rectangle(float l,float b) 
	{
	
	float rct;            // rct=area of rectangle
	rct=l*b;
	System.out.println("Area of rectangle is :"+ rct);
		
	}
	 void circle(float r)
	 {
		 float circle;
		 circle=(3.14f)*r*r;      //circle=pie*r^2
		 System.out.println("Area of Circle is :"+circle);
		 
	 }

	public static void main(String[] args) {
		
		AreaOf_Following a1=new AreaOf_Following();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangle :");
		System.out.println("Enter The length of Rectangle : ");
		float l=sc.nextFloat();
		System.out.println("Enter The Bredth of Rectangle :");
		float b=sc.nextFloat();
		
		a1.rectangle(l, b);
		System.out.println();
		
		System.out.println("Area of Circle : ");
		System.out.println("Enter the Redius of Circle :");
		float r=sc.nextFloat();
		a1.circle(r);
		

	}

}
