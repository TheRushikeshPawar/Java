package Classes_objects_Method;

import java.util.Scanner;

public class ReturnValueMethod {

	float radiussquare(float r)
	{
		return r*r;
	}
	void area(float rsq)
	{
		float area=3.14f*rsq;        // rsq=radius square
		System.out.println("Area of Circle is :"+area);
	}
	public static void main(String []args) {
		
		ReturnValueMethod m1=new ReturnValueMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Radius : ");
		
		float r=sc.nextFloat();
		float rsq=m1.radiussquare(r);
		m1.area(rsq);
		}
}
