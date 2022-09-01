package Classes_objects_Method;

import java.awt.geom.Arc2D;

		public class Calculator {
			
		void addition()
		{
			int a=20,b=30;
			System.out.println("Addition is        :"+(a+b));
			
				}
		void substaction()
		{
			int a=30,b=20;
			System.out.println("Substraction is    :"+(a-b));
			Multiplication();
			}
		
		void Multiplication()
		{
			int a=20,b=15;
			System.out.println("Multiplication is  :"+(a*b));
			}
		void division()
		{
			int a=50,b=5;
			System.out.println("Division is        :"+(a/b));
			}
		void power()
		{
			int a=6; int p=3;
			int product=1;
			for (int c=1;c<=p;c++)
			{
				product=product*a;
			}
			System.out.println("Power of Number is :"+product);
			}
		
		
		public static void main(String[]args) {
			
			Calculator c1=new Calculator();
			c1.addition();
			c1.substaction();
			c1.division();
			c1.power();
		}
		
		}
